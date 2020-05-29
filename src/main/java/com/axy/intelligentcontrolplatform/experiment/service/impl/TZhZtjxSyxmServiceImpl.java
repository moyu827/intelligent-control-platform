package com.axy.intelligentcontrolplatform.experiment.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.basic.utils.QueryWrapperUtils;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSyxm;
import com.axy.intelligentcontrolplatform.experiment.mapper.TZhZtjxSyxmMapper;
import com.axy.intelligentcontrolplatform.experiment.service.ITZhZtjxSyxmService;
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
 * 试验项目 服务实现类
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@Service
public class TZhZtjxSyxmServiceImpl extends ServiceImpl<TZhZtjxSyxmMapper, TZhZtjxSyxm> implements ITZhZtjxSyxmService {

    @Autowired
    TZhZtjxSyxmMapper tZhZtjxSyxmMapper;

    @Override
    public MessageBean getExperimentProject(TZhZtjxSyxm tZhZtjxSyxm) {
        Integer currentPage = tZhZtjxSyxm.getCurrentPage();
        Integer pageSize = tZhZtjxSyxm.getPageSize();
        int modelsCount = tZhZtjxSyxmMapper.getProjectCount(tZhZtjxSyxm);
        List<TZhZtjxSyxm> list = new ArrayList<>();
        if(null != currentPage){
            PageHelper.startPage(currentPage,pageSize);
        }

        if(modelsCount > 0){
            list = tZhZtjxSyxmMapper.getProject(tZhZtjxSyxm);
        }
        return MessageBean.getListSuccessMessageBean(modelsCount,list);
    }

    @Override
    public MessageBean postExperimentProject(TZhZtjxSyxm tZhZtjxSyxm) {
        if(null != tZhZtjxSyxm && !StringUtils.isEmpty(tZhZtjxSyxm.getObjId())){
            QueryWrapper<TZhZtjxSyxm> queryWrapper = QueryWrapperUtils.getQueryWrapper(TZhZtjxSyxm.class);
            queryWrapper.eq("mc",tZhZtjxSyxm.getMc());
            List<TZhZtjxSyxm> list = this.list(queryWrapper);
            if(list.size() > 0){
                MessageBean messageBean = new MessageBean();
                messageBean.setStatus("fail");
                messageBean.setMessage("该项目名称已存在");
                return messageBean;
            }
            this.updateById(tZhZtjxSyxm);
            return MessageBean.putSuccessMessageBean();
        }
        QueryWrapper<TZhZtjxSyxm> queryWrapper = QueryWrapperUtils.getQueryWrapper(TZhZtjxSyxm.class);
        queryWrapper.eq("mc",tZhZtjxSyxm.getMc());
        List<TZhZtjxSyxm> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该项目名称已存在");
            return messageBean;
        }
        IdGenerator idGenerator = new IdGenerator();
        tZhZtjxSyxm.setObjId(String.valueOf(idGenerator.nextId()));
        this.save(tZhZtjxSyxm);
        return MessageBean.postSuccessMessageBean();
    }

    @Override
    public MessageBean deleteExperimentProject(String objId) {
        this.removeById(objId);
        return MessageBean.deleteSuccessMessageBean();
    }
}
