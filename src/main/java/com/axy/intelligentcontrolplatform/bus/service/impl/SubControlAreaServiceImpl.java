package com.axy.intelligentcontrolplatform.bus.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.basic.utils.QueryWrapperUtils;
import com.axy.intelligentcontrolplatform.bus.entity.SubControlArea;
import com.axy.intelligentcontrolplatform.bus.mapper.SubControlAreaMapper;
import com.axy.intelligentcontrolplatform.bus.requestParam.SubControlAreaParam;
import com.axy.intelligentcontrolplatform.bus.service.ISubControlAreaService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 子控区表 服务实现类
 * </p>
 *
 * @author yct
 * @since 2020-05-12
 */
@Service
public class SubControlAreaServiceImpl extends ServiceImpl<SubControlAreaMapper, SubControlArea> implements ISubControlAreaService {
    @Autowired
    private SubControlAreaMapper subControlAreaMapper;
    @Override
    public MessageBean addSubControlArea(SubControlArea subControlArea) {
        QueryWrapper<SubControlArea> queryWrapper = QueryWrapperUtils.getQueryWrapper(SubControlArea.class);
        queryWrapper.eq("name",subControlArea.getName());
        Integer type = subControlArea.getType();
        if(type == 2 || type == 3){
            queryWrapper.eq("parent_id",subControlArea.getParentId());
        }
        List<SubControlArea> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该子控区已存在");
            return messageBean;
        }
        IdGenerator idGenerator = new IdGenerator();
        subControlArea.setId(idGenerator.nextId());
        this.save(subControlArea);
        return MessageBean.postSuccessMessageBean();
    }

    @Override
    public MessageBean deleteSubControlArea(Long id) {
        subControlAreaMapper.removeChildParentId(id);
        this.removeById(id);
        return MessageBean.deleteSuccessMessageBean();
    }

    @Override
    public MessageBean putSubControlArea(SubControlArea subControlArea) {
        QueryWrapper<SubControlArea> queryWrapper = QueryWrapperUtils.getQueryWrapper(SubControlArea.class);
        queryWrapper.eq("name",subControlArea.getName());
        Integer type = subControlArea.getType();
        if(type == 2 || type == 3){
            queryWrapper.eq("parent_id",subControlArea.getParentId());
        }
        List<SubControlArea> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该子控区已存在");
            return messageBean;
        }
        this.updateById(subControlArea);
        return  MessageBean.putSuccessMessageBean();
    }

    @Override
    public MessageBean getSubControlAreas(SubControlAreaParam subControlAreaParam) {
        int count = subControlAreaMapper.getSubControlAreaCount(subControlAreaParam);
        Integer currentPage = subControlAreaParam.getCurrentPage();
        Integer pageSize = subControlAreaParam.getPageSize();
        if(null != currentPage){
            PageHelper.startPage(currentPage,pageSize);
        }
        List<SubControlArea> list = new ArrayList<>();
        if(count > 0){
            list = subControlAreaMapper.getSubControlAreas(subControlAreaParam);
        }
        return MessageBean.getListSuccessMessageBean(count,list);
    }
}
