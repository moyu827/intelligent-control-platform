package com.axy.intelligentcontrolplatform.bus.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.basic.utils.QueryWrapperUtils;
import com.axy.intelligentcontrolplatform.bus.entity.PowerDevModel;
import com.axy.intelligentcontrolplatform.bus.mapper.PowerDevModelMapper;
import com.axy.intelligentcontrolplatform.bus.requestParam.PowerDevModelParam;
import com.axy.intelligentcontrolplatform.bus.service.IPowerDevModelService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 电力设备型号表 服务实现类
 * </p>
 *
 * @author yct
 * @since 2020-05-07
 */
@Service
public class PowerDevModelServiceImpl extends ServiceImpl<PowerDevModelMapper, PowerDevModel> implements IPowerDevModelService {
    @Autowired
    private PowerDevModelMapper powerDevModelMapper;

    @Override
    public MessageBean addPowerDevModel(PowerDevModel powerDevModel) {
        QueryWrapper<PowerDevModel> queryWrapper = QueryWrapperUtils.getQueryWrapper(PowerDevModel.class);
        queryWrapper.eq("name",powerDevModel.getName());
        queryWrapper.eq("type_id",powerDevModel.getTypeId());
        queryWrapper.eq("manufacturer_id",powerDevModel.getManufacturerId());
        List<PowerDevModel> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该型号已存在");
            return messageBean;
        }
        IdGenerator idGenerator = new IdGenerator();
        powerDevModel.setId(idGenerator.nextId());
        this.save(powerDevModel);
        return MessageBean.postSuccessMessageBean();
    }

    @Override
    public MessageBean deletePowerDevModel(Long id) {
        this.removeById(id);
        return MessageBean.deleteSuccessMessageBean();
    }

    @Override
    public MessageBean putPowerDevModel(PowerDevModel powerDevModel) {
        QueryWrapper<PowerDevModel> queryWrapper = QueryWrapperUtils.getQueryWrapper(PowerDevModel.class);
        queryWrapper.eq("name",powerDevModel.getName());
        queryWrapper.eq("type_id",powerDevModel.getTypeId());
        queryWrapper.eq("manufacturer_id",powerDevModel.getManufacturerId());
        List<PowerDevModel> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该型号已存在");
            return messageBean;
        }
        this.updateById(powerDevModel);
        return MessageBean.putSuccessMessageBean();
    }

    @Override
    public MessageBean getPowerDevModels(PowerDevModelParam powerDevModelParam) {
        Integer currentPage = powerDevModelParam.getCurrentPage();
        Integer pageSize = powerDevModelParam.getPageSize();
        int powerDevModelsCount = powerDevModelMapper.getPowerDevModelsCount(powerDevModelParam);
        List<PowerDevModel> list = new ArrayList<>();
        if(null != currentPage){
            PageHelper.startPage(currentPage,pageSize);
        }

        if(powerDevModelsCount > 0){
            list = powerDevModelMapper.getPowerDevModels(powerDevModelParam);
        }

        return MessageBean.getListSuccessMessageBean(powerDevModelsCount,list);
    }
}
