package com.axy.intelligentcontrolplatform.standing.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.basic.utils.QueryWrapperUtils;
import com.axy.intelligentcontrolplatform.standing.entity.TSbZnycBjfj;
import com.axy.intelligentcontrolplatform.standing.mapper.TSbZnycBjfjMapper;
import com.axy.intelligentcontrolplatform.standing.requestParam.TSbZnycBjfjParam;
import com.axy.intelligentcontrolplatform.standing.service.ITSbZnycBjfjService;
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
 * 部件附件 服务实现类
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Service
public class TSbZnycBjfjServiceImpl extends ServiceImpl<TSbZnycBjfjMapper, TSbZnycBjfj> implements ITSbZnycBjfjService {

    @Autowired
    private TSbZnycBjfjMapper tSbZnycBjfjMapper;
    @Override
    public MessageBean getPartsAccessories(TSbZnycBjfjParam param) {
        Integer currentPage = param.getCurrentPage();
        Integer pageSize = param.getPageSize();
        int modelsCount = tSbZnycBjfjMapper.getPartsAccessoriesCount(param);
        List<TSbZnycBjfj> list = new ArrayList<>();
        if(null != currentPage){
            PageHelper.startPage(currentPage,pageSize);
        }

        if(modelsCount > 0){
            list = tSbZnycBjfjMapper.getPartsAccessories(param);
        }

        return MessageBean.getListSuccessMessageBean(modelsCount,list);
    }

    @Override
    public MessageBean postPartsAccessories(TSbZnycBjfj tSbZnycBjfj) {
        if(null != tSbZnycBjfj && !StringUtils.isEmpty(tSbZnycBjfj.getObjId())){
            QueryWrapper<TSbZnycBjfj> queryWrapper = QueryWrapperUtils.getQueryWrapper(TSbZnycBjfj.class);
            queryWrapper.eq("sbbm",tSbZnycBjfj.getSbbm());
            queryWrapper.eq("sbmc",tSbZnycBjfj.getSbmc());
            List<TSbZnycBjfj> list = this.list(queryWrapper);
            if(list.size() > 0){
                MessageBean messageBean = new MessageBean();
                messageBean.setStatus("fail");
                messageBean.setMessage("该设备已存在");
                return messageBean;
            }
            this.updateById(tSbZnycBjfj);
            return MessageBean.putSuccessMessageBean();
        }
        QueryWrapper<TSbZnycBjfj> queryWrapper = QueryWrapperUtils.getQueryWrapper(TSbZnycBjfj.class);
        queryWrapper.eq("sbbm",tSbZnycBjfj.getSbbm());
        queryWrapper.eq("sbmc",tSbZnycBjfj.getSbmc());
        List<TSbZnycBjfj> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该设备已存在");
            return messageBean;
        }
        IdGenerator idGenerator = new IdGenerator();
        tSbZnycBjfj.setObjId(String.valueOf(idGenerator.nextId()));
        this.save(tSbZnycBjfj);
        return MessageBean.postSuccessMessageBean();
    }

    @Override
    public MessageBean deletePartsAccessories(String id) {
        this.removeById(id);
        return MessageBean.deleteSuccessMessageBean();
    }

    @Override
    public MessageBean selectPartsAccessories(TSbZnycBjfj tSbZnycBjfj) {
        List<TSbZnycBjfj> list = tSbZnycBjfjMapper.selectPartsAccessories(tSbZnycBjfj);
        return MessageBean.getOneSuccessMessageBean(list);
    }
}
