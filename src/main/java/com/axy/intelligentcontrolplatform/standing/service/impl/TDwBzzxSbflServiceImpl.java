package com.axy.intelligentcontrolplatform.standing.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.basic.utils.QueryWrapperUtils;
import com.axy.intelligentcontrolplatform.standing.entity.TDwBzzxSbfl;
import com.axy.intelligentcontrolplatform.standing.mapper.TDwBzzxSbflMapper;
import com.axy.intelligentcontrolplatform.standing.requestParam.TDwBzzxSbflParam;
import com.axy.intelligentcontrolplatform.standing.service.ITDwBzzxSbflService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * <p>
 * 设备类型表 服务实现类
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Service
public class TDwBzzxSbflServiceImpl extends ServiceImpl<TDwBzzxSbflMapper, TDwBzzxSbfl> implements ITDwBzzxSbflService {

    @Autowired
    private TDwBzzxSbflMapper tDwBzzxSbflMapper;

    @Override
    public MessageBean getPartsType(TDwBzzxSbflParam param) {
        Integer currentPage = param.getCurrentPage();
        Integer pageSize = param.getPageSize();
        int modelsCount = tDwBzzxSbflMapper.getPartsTypeCount(param);
        List<TDwBzzxSbfl> list = new ArrayList<>();
        if(null != currentPage){
            PageHelper.startPage(currentPage,pageSize);
        }

        if(modelsCount > 0){
            list = tDwBzzxSbflMapper.getPartsType(param);
        }

        return MessageBean.getListSuccessMessageBean(modelsCount,list);
    }

    @Override
    public MessageBean postPartsType(TDwBzzxSbfl tDwBzzxSbfl) {
        if(null != tDwBzzxSbfl && !StringUtils.isEmpty(tDwBzzxSbfl.getObjId())){
            QueryWrapper<TDwBzzxSbfl> queryWrapper = QueryWrapperUtils.getQueryWrapper(TDwBzzxSbfl.class);
            queryWrapper.eq("sblxmc",tDwBzzxSbfl.getSblxmc());
            List<TDwBzzxSbfl> list = this.list(queryWrapper);
            if(list.size() > 0){
                MessageBean messageBean = new MessageBean();
                messageBean.setStatus("fail");
                messageBean.setMessage("该设备名称已存在");
                return messageBean;
            }
            this.updateById(tDwBzzxSbfl);
            return MessageBean.putSuccessMessageBean();
        }
        QueryWrapper<TDwBzzxSbfl> queryWrapper = QueryWrapperUtils.getQueryWrapper(TDwBzzxSbfl.class);
        queryWrapper.eq("sblxmc",tDwBzzxSbfl.getSblxmc());
        List<TDwBzzxSbfl> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该设备名称已存在");
            return messageBean;
        }
        IdGenerator idGenerator = new IdGenerator();
        tDwBzzxSbfl.setObjId(String.valueOf(idGenerator.nextId()));
        this.save(tDwBzzxSbfl);
        return MessageBean.postSuccessMessageBean();
    }


    @Override
    public MessageBean deletePartsType(String id) {
        this.removeById(id);
        return MessageBean.deleteSuccessMessageBean();
    }

    @Override
    public MessageBean selectPartsType(TDwBzzxSbfl tDwBzzxSbfl) {
        List<TDwBzzxSbfl> list = tDwBzzxSbflMapper.selectPartsType(tDwBzzxSbfl);
        return MessageBean.getOneSuccessMessageBean(list);
    }
}
