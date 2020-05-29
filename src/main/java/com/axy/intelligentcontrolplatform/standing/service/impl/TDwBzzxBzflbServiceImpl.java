package com.axy.intelligentcontrolplatform.standing.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.basic.utils.QueryWrapperUtils;
import com.axy.intelligentcontrolplatform.standing.entity.TDwBzzxBzflb;
import com.axy.intelligentcontrolplatform.standing.mapper.TDwBzzxBzflbMapper;
import com.axy.intelligentcontrolplatform.standing.requestParam.TDwBzzxBzflbParam;
import com.axy.intelligentcontrolplatform.standing.service.ITDwBzzxBzflbService;
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
 * 标准分类表 服务实现类
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Service
public class TDwBzzxBzflbServiceImpl extends ServiceImpl<TDwBzzxBzflbMapper, TDwBzzxBzflb> implements ITDwBzzxBzflbService {


    @Autowired
    private TDwBzzxBzflbMapper tDwBzzxBzflbMapper;

    @Override
    public MessageBean getNormalSort(TDwBzzxBzflbParam param) {
        Integer currentPage = param.getCurrentPage();
        Integer pageSize = param.getPageSize();
        int modelsCount = tDwBzzxBzflbMapper.getNormalSortCount(param);
        List<TDwBzzxBzflb> list = new ArrayList<>();
        if(null != currentPage){
            PageHelper.startPage(currentPage,pageSize);
        }

        if(modelsCount > 0){
            list = tDwBzzxBzflbMapper.getNormalSort(param);
        }

        return MessageBean.getListSuccessMessageBean(modelsCount,list);
    }

    @Override
    public MessageBean postNormalSort(TDwBzzxBzflb tDwBzzxBzflb) {
        if(null != tDwBzzxBzflb && !StringUtils.isEmpty(tDwBzzxBzflb.getObjId())){
            QueryWrapper<TDwBzzxBzflb> queryWrapper = QueryWrapperUtils.getQueryWrapper(TDwBzzxBzflb.class);
            queryWrapper.eq("bzflmc",tDwBzzxBzflb.getBzflmc());
            List<TDwBzzxBzflb> list = this.list(queryWrapper);
            if(list.size() > 0){
                MessageBean messageBean = new MessageBean();
                messageBean.setStatus("fail");
                messageBean.setMessage("该标准名称已存在");
                return messageBean;
            }
            this.updateById(tDwBzzxBzflb);
            return MessageBean.putSuccessMessageBean();
        }
        QueryWrapper<TDwBzzxBzflb> queryWrapper = QueryWrapperUtils.getQueryWrapper(TDwBzzxBzflb.class);
        queryWrapper.eq("bzflmc",tDwBzzxBzflb.getBzflmc());
        List<TDwBzzxBzflb> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该标准名称已存在");
            return messageBean;
        }
        IdGenerator idGenerator = new IdGenerator();
        tDwBzzxBzflb.setObjId(String.valueOf(idGenerator.nextId()));
        this.save(tDwBzzxBzflb);
        return MessageBean.postSuccessMessageBean();
    }

    @Override
    public MessageBean deleteNormalSort(String id) {
        this.removeById(id);
        return MessageBean.deleteSuccessMessageBean();
    }

    @Override
    public MessageBean selectNormalSort(TDwBzzxBzflb tDwBzzxBzflb) {
        List<TDwBzzxBzflb> list = tDwBzzxBzflbMapper.selectNormalSort(tDwBzzxBzflb);
        return MessageBean.getOneSuccessMessageBean(list);
    }
}
