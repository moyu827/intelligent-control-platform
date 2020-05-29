package com.axy.intelligentcontrolplatform.standing.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.basic.utils.QueryWrapperUtils;
import com.axy.intelligentcontrolplatform.standing.entity.TDwBzzxSccj;
import com.axy.intelligentcontrolplatform.standing.mapper.TDwBzzxSccjMapper;
import com.axy.intelligentcontrolplatform.standing.requestParam.TDwBzzxSccjParam;
import com.axy.intelligentcontrolplatform.standing.service.ITDwBzzxSccjService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 生产厂家 服务实现类
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Service
public class TDwBzzxSccjServiceImpl extends ServiceImpl<TDwBzzxSccjMapper, TDwBzzxSccj> implements ITDwBzzxSccjService {

    @Autowired
    private TDwBzzxSccjMapper tDwBzzxSccjMapper;


    @Override
    public MessageBean postMfrs(TDwBzzxSccj tDwBzzxSccj) {
        if(null != tDwBzzxSccj && !StringUtils.isEmpty(tDwBzzxSccj.getObjId())){
            QueryWrapper<TDwBzzxSccj> queryWrapper = QueryWrapperUtils.getQueryWrapper(TDwBzzxSccj.class);
            queryWrapper.eq("sccjmc",tDwBzzxSccj.getSccjmc());
            queryWrapper.eq("sccjbm",tDwBzzxSccj.getSccjbm());
            List<TDwBzzxSccj> list = this.list(queryWrapper);
            if(list.size() > 0){
                MessageBean messageBean = new MessageBean();
                messageBean.setStatus("fail");
                messageBean.setMessage("该厂家已存在");
                return messageBean;
            }
            this.updateById(tDwBzzxSccj);
            return MessageBean.putSuccessMessageBean();
        }
        QueryWrapper<TDwBzzxSccj> queryWrapper = QueryWrapperUtils.getQueryWrapper(TDwBzzxSccj.class);
        queryWrapper.eq("sccjmc",tDwBzzxSccj.getSccjmc());
        queryWrapper.eq("sccjbm",tDwBzzxSccj.getSccjbm());
        List<TDwBzzxSccj> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该厂家已存在");
            return messageBean;
        }
        IdGenerator idGenerator = new IdGenerator();
        tDwBzzxSccj.setObjId(String.valueOf(idGenerator.nextId()));
        this.save(tDwBzzxSccj);
        return MessageBean.postSuccessMessageBean();
    }

    @Override
    public MessageBean deleteMfrs(String id) {
        this.removeById(id);
        return MessageBean.deleteSuccessMessageBean();
    }

    @Override
    public MessageBean getMfrs(TDwBzzxSccjParam tDwBzzxSccjParam) {
        Integer currentPage = tDwBzzxSccjParam.getCurrentPage();
        Integer pageSize = tDwBzzxSccjParam.getPageSize();
        int modelsCount = tDwBzzxSccjMapper.getMfrsCount(tDwBzzxSccjParam);
        List<TDwBzzxSccj> list = new ArrayList<>();
        if(null != currentPage){
            PageHelper.startPage(currentPage,pageSize);
        }

        if(modelsCount > 0){
            list = tDwBzzxSccjMapper.getMfrs(tDwBzzxSccjParam);
        }

        return MessageBean.getListSuccessMessageBean(modelsCount,list);
    }

    @Override
    public MessageBean selectMfrs(TDwBzzxSccj tDwBzzxSccj) {
        List<TDwBzzxSccj> list = tDwBzzxSccjMapper.selectMfrs(tDwBzzxSccj);
        return MessageBean.getOneSuccessMessageBean(list);
    }


}
