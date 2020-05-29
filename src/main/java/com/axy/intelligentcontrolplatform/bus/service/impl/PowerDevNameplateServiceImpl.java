package com.axy.intelligentcontrolplatform.bus.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.bus.entity.PowerDevNameplate;
import com.axy.intelligentcontrolplatform.bus.mapper.PowerDevNameplateMapper;
import com.axy.intelligentcontrolplatform.bus.requestParam.PowerDevNameplateParam;
import com.axy.intelligentcontrolplatform.bus.service.IPowerDevNameplateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 铭牌参数表 服务实现类
 * </p>
 *
 * @author yct
 * @since 2020-05-07
 */
@Service
public class PowerDevNameplateServiceImpl extends ServiceImpl<PowerDevNameplateMapper, PowerDevNameplate> implements IPowerDevNameplateService {
    @Autowired
    private PowerDevNameplateMapper powerDevNameplateMapper;
    @Override
    public MessageBean addPowerDevNameplate(PowerDevNameplate powerDevNameplate) {
        IdGenerator idGenerator = new IdGenerator();
        powerDevNameplate.setId(idGenerator.nextId());
        this.save(powerDevNameplate);
        return MessageBean.postSuccessMessageBean();
    }

    @Override
    public MessageBean deletePowerDevNameplate(Long id) {
        this.removeById(id);
        return MessageBean.deleteSuccessMessageBean();
    }

    @Override
    public MessageBean putPowerDevNameplate(PowerDevNameplate powerDevModel) {
        this.updateById(powerDevModel);
        return MessageBean.putSuccessMessageBean();
    }

    @Override
    public MessageBean getPowerDevNameplates(PowerDevNameplateParam powerDevNameplateParam) {
        Integer currentPage = powerDevNameplateParam.getCurrentPage();
        Integer pageSize = powerDevNameplateParam.getPageSize();
        List<PowerDevNameplate> list = new ArrayList<>();
        int powerDevNameplatesCount = powerDevNameplateMapper.getPowerDevNameplatesCount(powerDevNameplateParam);
        if( null != currentPage){
            PageHelper.startPage(currentPage,pageSize);
        }
        if(powerDevNameplatesCount > 0 ){
            list = powerDevNameplateMapper.getPowerDevNameplates(powerDevNameplateParam);
        }
        return MessageBean.getListSuccessMessageBean(powerDevNameplatesCount,list);
    }
}
