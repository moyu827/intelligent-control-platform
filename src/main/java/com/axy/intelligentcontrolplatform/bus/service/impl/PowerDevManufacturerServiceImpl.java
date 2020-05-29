package com.axy.intelligentcontrolplatform.bus.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.basic.utils.QueryWrapperUtils;
import com.axy.intelligentcontrolplatform.bus.entity.PowerDevManufacturer;
import com.axy.intelligentcontrolplatform.bus.mapper.PowerDevManufacturerMapper;
import com.axy.intelligentcontrolplatform.bus.requestParam.PowerDevManufacturerParam;
import com.axy.intelligentcontrolplatform.bus.service.IPowerDevManufacturerService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 电力设备厂商表 服务实现类
 * </p>
 *
 * @author yct
 * @since 2020-05-07
 */
@Service
public class PowerDevManufacturerServiceImpl extends ServiceImpl<PowerDevManufacturerMapper, PowerDevManufacturer> implements IPowerDevManufacturerService {

    @Override
    public MessageBean addPowerDevManufacturer(String name) {
        QueryWrapper<PowerDevManufacturer> queryWrapper = QueryWrapperUtils.getQueryWrapper(PowerDevManufacturer.class);
        queryWrapper.eq("name",name);
        List<PowerDevManufacturer> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该厂商已存在");
            return messageBean;
        }
        IdGenerator idGenerator = new IdGenerator();
        PowerDevManufacturer powerDevManufacturer = new PowerDevManufacturer();
        powerDevManufacturer.setId(idGenerator.nextId());
        powerDevManufacturer.setName(name);
        this.save(powerDevManufacturer);
        return MessageBean.postSuccessMessageBean();
    }

    @Override
    public MessageBean deletePowerDevManufacturer(Long id) {
        this.removeById(id);
        return MessageBean.deleteSuccessMessageBean();
    }

    @Override
    public MessageBean putPowerDevManufacturer(PowerDevManufacturer devManufacturer) {
        QueryWrapper<PowerDevManufacturer> queryWrapper = QueryWrapperUtils.getQueryWrapper(PowerDevManufacturer.class);
        queryWrapper.eq("name",devManufacturer.getName());
        List<PowerDevManufacturer> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该厂商已存在");
            return messageBean;
        }
        this.updateById(devManufacturer);
        return MessageBean.putSuccessMessageBean();
    }

    @Override
    public MessageBean getPowerDevManufacturers(PowerDevManufacturerParam powerDevManufacturerParam) {
        QueryWrapper<PowerDevManufacturer> queryWrapper = QueryWrapperUtils.getQueryWrapper(PowerDevManufacturer.class);
        String name = powerDevManufacturerParam.getName();
        if(null != name && !"".equals(name)){
            queryWrapper.like("name",name);
        }
        Long id = powerDevManufacturerParam.getId();
        if(null != id){
            queryWrapper.eq("id",id);
        }
        int count = this.count(queryWrapper);
        Integer currentPage = powerDevManufacturerParam.getCurrentPage();
        Integer pageSize = powerDevManufacturerParam.getPageSize();
        if(null != currentPage){
            PageHelper.startPage(currentPage,pageSize);
        }
        List<PowerDevManufacturer> list = new ArrayList<>();
        if(count > 0){
            list = this.list(queryWrapper);
        }
        return MessageBean.getListSuccessMessageBean(count,list);
    }

}
