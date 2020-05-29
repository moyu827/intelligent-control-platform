package com.axy.intelligentcontrolplatform.experiment.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.basic.utils.QueryWrapperUtils;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSybw;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSymb;
import com.axy.intelligentcontrolplatform.experiment.mapper.TZhZtjxSybwMapper;
import com.axy.intelligentcontrolplatform.experiment.service.ITZhZtjxSybwService;
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
 * 试验部位 服务实现类
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@Service
public class TZhZtjxSybwServiceImpl extends ServiceImpl<TZhZtjxSybwMapper, TZhZtjxSybw> implements ITZhZtjxSybwService {

    @Autowired
    TZhZtjxSybwMapper tZhZtjxSybwMapper;
    @Override
    public MessageBean getExperimentPosition(TZhZtjxSybw tZhZtjxSybw) {
        Integer currentPage = tZhZtjxSybw.getCurrentPage();
        Integer pageSize = tZhZtjxSybw.getPageSize();
        int modelsCount = tZhZtjxSybwMapper.getExperimentPositionCount(tZhZtjxSybw);
        List<TZhZtjxSybw> list = new ArrayList<>();
        if(null != currentPage){
            PageHelper.startPage(currentPage,pageSize);
        }

        if(modelsCount > 0){
            list = tZhZtjxSybwMapper.getExperimentPosition(tZhZtjxSybw);
        }
        return MessageBean.getListSuccessMessageBean(modelsCount,list);
    }

    @Override
    public MessageBean postExperimentPosition(TZhZtjxSybw tZhZtjxSybw) {
        if(null != tZhZtjxSybw && !StringUtils.isEmpty(tZhZtjxSybw.getObjId())){
            QueryWrapper<TZhZtjxSybw> queryWrapper = QueryWrapperUtils.getQueryWrapper(TZhZtjxSybw.class);
            queryWrapper.eq("mc",tZhZtjxSybw.getMc());
            List<TZhZtjxSybw> list = this.list(queryWrapper);
            if(list.size() > 0){
                MessageBean messageBean = new MessageBean();
                messageBean.setStatus("fail");
                messageBean.setMessage("该部位名称已存在");
                return messageBean;
            }
            this.updateById(tZhZtjxSybw);
            return MessageBean.putSuccessMessageBean();
        }
        QueryWrapper<TZhZtjxSybw> queryWrapper = QueryWrapperUtils.getQueryWrapper(TZhZtjxSybw.class);
        queryWrapper.eq("mc",tZhZtjxSybw.getMc());
        List<TZhZtjxSybw> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该部位名称已存在");
            return messageBean;
        }
        IdGenerator idGenerator = new IdGenerator();
        tZhZtjxSybw.setObjId(String.valueOf(idGenerator.nextId()));
        this.save(tZhZtjxSybw);
        return MessageBean.postSuccessMessageBean();
    }

    @Override
    public MessageBean deleteExperimentPosition(String objId) {
        this.removeById(objId);
        return MessageBean.deleteSuccessMessageBean();
    }

    @Override
    public List<TZhZtjxSybw> getPositionById(String param1, String param2) {
        return tZhZtjxSybwMapper.getPositionById(param1,param2);
    }
}
