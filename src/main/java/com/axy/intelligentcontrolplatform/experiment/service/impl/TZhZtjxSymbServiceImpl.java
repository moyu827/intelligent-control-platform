package com.axy.intelligentcontrolplatform.experiment.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.basic.utils.QueryWrapperUtils;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSymb;
import com.axy.intelligentcontrolplatform.experiment.mapper.TZhZtjxSymbMapper;
import com.axy.intelligentcontrolplatform.experiment.service.ITZhZtjxSymbService;
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
 * 试验模板 服务实现类
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@Service
public class TZhZtjxSymbServiceImpl extends ServiceImpl<TZhZtjxSymbMapper, TZhZtjxSymb> implements ITZhZtjxSymbService {

    @Autowired
    TZhZtjxSymbMapper tZhZtjxSymbMapper;

    @Override
    public MessageBean getExperimentTemp(TZhZtjxSymb tZhZtjxSymb) {
        Integer currentPage = tZhZtjxSymb.getCurrentPage();
        Integer pageSize = tZhZtjxSymb.getPageSize();
        int modelsCount = tZhZtjxSymbMapper.getExperimentTempCount(tZhZtjxSymb);
        List<TZhZtjxSymb> list = new ArrayList<>();
        if(null != currentPage){
            PageHelper.startPage(currentPage,pageSize);
        }

        if(modelsCount > 0){
            list = tZhZtjxSymbMapper.getExperimentTemp(tZhZtjxSymb);
        }
        return MessageBean.getListSuccessMessageBean(modelsCount,list);
    }

    @Override
    public MessageBean postExperimentTemp(TZhZtjxSymb tZhZtjxSymb) {
        if(null != tZhZtjxSymb && !StringUtils.isEmpty(tZhZtjxSymb.getObjId())){
            QueryWrapper<TZhZtjxSymb> queryWrapper = QueryWrapperUtils.getQueryWrapper(TZhZtjxSymb.class);
            queryWrapper.eq("mc",tZhZtjxSymb.getMc());
            List<TZhZtjxSymb> list = this.list(queryWrapper);
            if(list.size() > 0){
                MessageBean messageBean = new MessageBean();
                messageBean.setStatus("fail");
                messageBean.setMessage("该模板名称已存在");
                return messageBean;
            }
            this.updateById(tZhZtjxSymb);
            return MessageBean.putSuccessMessageBean();
        }
        QueryWrapper<TZhZtjxSymb> queryWrapper = QueryWrapperUtils.getQueryWrapper(TZhZtjxSymb.class);
        queryWrapper.eq("mc",tZhZtjxSymb.getMc());
        List<TZhZtjxSymb> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该模板名称已存在");
            return messageBean;
        }
        IdGenerator idGenerator = new IdGenerator();
        tZhZtjxSymb.setObjId(String.valueOf(idGenerator.nextId()));
        this.save(tZhZtjxSymb);
        return MessageBean.postSuccessMessageBean();
    }

    @Override
    public MessageBean deleteExperimentTemp(String objId) {
        this.removeById(objId);
        return MessageBean.deleteSuccessMessageBean();
    }

    @Override
    public MessageBean selectExperimentTemp(TZhZtjxSymb tZhZtjxSymb) {
        List<TZhZtjxSymb> list = tZhZtjxSymbMapper.selectExperimentTemp(tZhZtjxSymb);
        return MessageBean.getOneSuccessMessageBean(list);
    }

}
