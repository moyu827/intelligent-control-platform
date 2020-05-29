package com.axy.intelligentcontrolplatform.sys.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.sys.entity.OverhaulUnit;
import com.axy.intelligentcontrolplatform.sys.mapper.OverhaulUnitMapper;
import com.axy.intelligentcontrolplatform.sys.requestParam.OverHaulUnitParam;
import com.axy.intelligentcontrolplatform.sys.service.IOverhaulUnitService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yct
 * @since 2020-04-30
 */
@Service
public class OverhaulUnitServiceImpl extends ServiceImpl<OverhaulUnitMapper, OverhaulUnit> implements IOverhaulUnitService {

    @Override
    public MessageBean addOverHaulUnit(String name) {
        QueryWrapper<OverhaulUnit> queryWrapper = getQueryWrapper();
        queryWrapper.eq("name",name);
        List<OverhaulUnit> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该厂商已存在");
            return messageBean;
        }
        IdGenerator idGenerator = new IdGenerator();
        OverhaulUnit overhaulUnit = new OverhaulUnit();
        overhaulUnit.setId(idGenerator.nextId());
        overhaulUnit.setName(name);
        this.save(overhaulUnit);
        return MessageBean.postSuccessMessageBean();
    }

    @Override
    public MessageBean deleteOverHaulUnit(Long id) {
        this.removeById(id);
        return MessageBean.deleteSuccessMessageBean();
    }

    @Override
    public MessageBean putOverHaulUnit(OverhaulUnit overhaulUnit) {
        QueryWrapper<OverhaulUnit> queryWrapper = getQueryWrapper();
        queryWrapper.eq("name",overhaulUnit.getName());
        List<OverhaulUnit> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该厂商已存在");
            return messageBean;
        }
        this.updateById(overhaulUnit);
        return MessageBean.putSuccessMessageBean();
    }

    @Override
    public MessageBean getOverHaulUnits(OverHaulUnitParam overHaulUnitParam) {

        QueryWrapper<OverhaulUnit> queryWrapper = getQueryWrapper();
        String name = overHaulUnitParam.getName();
        if(null != name && !"".equals(name)){
            queryWrapper.like("name",name);
        }
        Long id = overHaulUnitParam.getId();
        if(null != id){
            queryWrapper.eq("id",id);
        }
        int count = this.count(queryWrapper);
        Integer currentPage = overHaulUnitParam.getCurrentPage();
        Integer pageSize = overHaulUnitParam.getPageSize();
        if(null != currentPage){
            PageHelper.startPage(currentPage,pageSize);
        }
        List<OverhaulUnit> list = new ArrayList<>();
        if(count > 0){
            list = this.list(queryWrapper);
        }
        return MessageBean.getListSuccessMessageBean(list.size(),list);
    }


    private QueryWrapper<OverhaulUnit> getQueryWrapper(){
        QueryWrapper<OverhaulUnit> queryWrapper = new QueryWrapper<>();
        return queryWrapper;
    }
}
