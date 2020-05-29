package com.axy.intelligentcontrolplatform.bus.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.basic.utils.QueryWrapperUtils;
import com.axy.intelligentcontrolplatform.bus.entity.PowerDevManufacturer;
import com.axy.intelligentcontrolplatform.bus.entity.PowerDevType;
import com.axy.intelligentcontrolplatform.bus.mapper.PowerDevTypeMapper;
import com.axy.intelligentcontrolplatform.bus.requestParam.PowerDevTypeParam;
import com.axy.intelligentcontrolplatform.bus.service.IPowerDevTypeService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 电力设备类型表 服务实现类
 * </p>
 *
 * @author yct
 * @since 2020-05-07
 */
@Service
public class PowerDevTypeServiceImpl extends ServiceImpl<PowerDevTypeMapper, PowerDevType> implements IPowerDevTypeService {

    @Override
    public MessageBean addPowerDevType(String name) {
        QueryWrapper<PowerDevType> queryWrapper = QueryWrapperUtils.getQueryWrapper(PowerDevType.class);
        queryWrapper.eq("name",name);
        List<PowerDevType> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该厂商已存在");
            return messageBean;
        }
        IdGenerator idGenerator = new IdGenerator();
        PowerDevType powerDevType = new PowerDevType();
        powerDevType.setId(idGenerator.nextId());
        powerDevType.setName(name);
        this.save(powerDevType);
        return MessageBean.postSuccessMessageBean();
    }

    @Override
    public MessageBean deletePowerDevType(Long id) {
        this.removeById(id);
        return MessageBean.deleteSuccessMessageBean();
    }

    @Override
    public MessageBean putPowerDevType(PowerDevType powerDevType) {
        QueryWrapper<PowerDevType> queryWrapper = QueryWrapperUtils.getQueryWrapper(PowerDevType.class);
        queryWrapper.eq("name",powerDevType.getName());
        List<PowerDevType> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该厂商已存在");
            return messageBean;
        }
        this.updateById(powerDevType);
        return MessageBean.putSuccessMessageBean();
    }

    @Override
    public MessageBean getPowerDevTypes(PowerDevTypeParam powerDevTypeParam) {

        QueryWrapper<PowerDevType> queryWrapper = QueryWrapperUtils.getQueryWrapper(PowerDevType.class);
        String name = powerDevTypeParam.getName();
        if(null != name && !"".equals(name)){
            queryWrapper.like("name",name);
        }
        Long id = powerDevTypeParam.getId();
        if(null != id){
            queryWrapper.eq("id",id);
        }
        int count = this.count(queryWrapper);
        Integer currentPage = powerDevTypeParam.getCurrentPage();
        Integer pageSize = powerDevTypeParam.getPageSize();
        if(null != currentPage){
            PageHelper.startPage(currentPage,pageSize);
        }
        List<PowerDevType> list = new ArrayList<>();
        if(count > 0){
            list = this.list(queryWrapper);
        }
        return MessageBean.getListSuccessMessageBean(count,list);
    }
}
