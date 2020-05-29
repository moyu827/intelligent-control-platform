package com.axy.intelligentcontrolplatform.bus.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.basic.utils.QueryWrapperUtils;
import com.axy.intelligentcontrolplatform.bus.entity.VoltageLevel;
import com.axy.intelligentcontrolplatform.bus.mapper.VoltageLevelMapper;
import com.axy.intelligentcontrolplatform.bus.requestParam.VoltageLevelParam;
import com.axy.intelligentcontrolplatform.bus.service.IVoltageLevelService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 电压等级表 服务实现类
 * </p>
 *
 * @author yct
 * @since 2020-05-11
 */
@Service
public class VoltageLevelServiceImpl extends ServiceImpl<VoltageLevelMapper, VoltageLevel> implements IVoltageLevelService {


    @Override
    public MessageBean addVoltageLevel(VoltageLevel voltageLevel) {
        QueryWrapper<VoltageLevel> queryWrapper = QueryWrapperUtils.getQueryWrapper(VoltageLevel.class);
        String changeName = checkVoltageLevelName(voltageLevel.getName());
        queryWrapper.eq("name",changeName);
        List<VoltageLevel> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该电压已经存在");
            return messageBean;
        }
        voltageLevel.setName(changeName);
        IdGenerator idGenerator = new IdGenerator();
        voltageLevel.setId(idGenerator.nextId());
        this.save(voltageLevel);
        return MessageBean.postSuccessMessageBean();
    }

    @Override
    public MessageBean deleteVoltageLevel(Long id) {
        this.removeById(id);
        return MessageBean.deleteSuccessMessageBean();
    }

    @Override
    public MessageBean putVoltageLevel(VoltageLevel voltageLevel) {
        QueryWrapper<VoltageLevel> queryWrapper = QueryWrapperUtils.getQueryWrapper(VoltageLevel.class);
        String changeName = checkVoltageLevelName(voltageLevel.getName());
        queryWrapper.eq("name",changeName);
        List<VoltageLevel> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该电压已经存在");
            return messageBean;
        }
        this.updateById(voltageLevel);
        return  MessageBean.putSuccessMessageBean();
    }

    @Override
    public MessageBean getVoltageLevels(VoltageLevelParam voltageLevelParam) {
        QueryWrapper<VoltageLevel> queryWrapper = QueryWrapperUtils.getQueryWrapper(VoltageLevel.class);
        Long id = voltageLevelParam.getId();
        if(null != id){
            queryWrapper.eq("id",id);
        }
        String name = voltageLevelParam.getName();
        if(null != name && !"".equals(name)){
            queryWrapper.like("name",name);
        }
        int count = this.count(queryWrapper);
        Integer currentPage = voltageLevelParam.getCurrentPage();
        Integer pageSize = voltageLevelParam.getPageSize();
        if(null != currentPage){
            PageHelper.startPage(currentPage,pageSize);
        }
        List<VoltageLevel> list = new ArrayList<>();
        if(count > 0){
            list = this.list(queryWrapper);
        }
        return MessageBean.getListSuccessMessageBean(count,list);
    }

    private String  checkVoltageLevelName(String voltageLevelName){
        if(null != voltageLevelName && !"".equals(voltageLevelName)){
            if(voltageLevelName.indexOf("kv") > 0 || voltageLevelName.indexOf("kV") > 0 || voltageLevelName.indexOf("Kv") > 0 || voltageLevelName.indexOf("KV") > 0){
                voltageLevelName = voltageLevelName.substring(0, voltageLevelName.length() - 2) + "kV";
            }
//            else if(StringUtils.isNumeric(voltageLevelName)){
//                voltageLevelName = voltageLevelName+"kV";
//            }
        }
        return voltageLevelName;
    }
}
