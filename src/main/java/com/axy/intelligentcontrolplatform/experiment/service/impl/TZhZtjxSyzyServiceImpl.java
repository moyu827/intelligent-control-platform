package com.axy.intelligentcontrolplatform.experiment.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.basic.utils.QueryWrapperUtils;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSyxz;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSyzy;
import com.axy.intelligentcontrolplatform.experiment.mapper.TZhZtjxSyzyMapper;
import com.axy.intelligentcontrolplatform.experiment.service.ITZhZtjxSyzyService;
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
 * 试验专业 服务实现类
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@Service
public class TZhZtjxSyzyServiceImpl extends ServiceImpl<TZhZtjxSyzyMapper, TZhZtjxSyzy> implements ITZhZtjxSyzyService {

    @Autowired
    TZhZtjxSyzyMapper tZhZtjxSyzyMapper;

    @Override
    public MessageBean getSpeciality(TZhZtjxSyzy tZhZtjxSyzy) {
        Integer currentPage = tZhZtjxSyzy.getCurrentPage();
        Integer pageSize = tZhZtjxSyzy.getPageSize();
        int modelsCount = tZhZtjxSyzyMapper.getSpecialityCount(tZhZtjxSyzy);
        List<TZhZtjxSyzy> list = new ArrayList<>();
        if(null != currentPage){
            PageHelper.startPage(currentPage,pageSize);
        }

        if(modelsCount > 0){
            list = tZhZtjxSyzyMapper.getSpeciality(tZhZtjxSyzy);
        }
        return MessageBean.getListSuccessMessageBean(modelsCount,list);
    }

    @Override
    public MessageBean postSpeciality(TZhZtjxSyzy tZhZtjxSyzy) {
        if(null != tZhZtjxSyzy && !StringUtils.isEmpty(tZhZtjxSyzy.getObjId())){
            QueryWrapper<TZhZtjxSyzy> queryWrapper = QueryWrapperUtils.getQueryWrapper(TZhZtjxSyzy.class);
            queryWrapper.eq("mc",tZhZtjxSyzy.getMc());
            List<TZhZtjxSyzy> list = this.list(queryWrapper);
            if(list.size() > 0){
                MessageBean messageBean = new MessageBean();
                messageBean.setStatus("fail");
                messageBean.setMessage("该试验专业已存在");
                return messageBean;
            }
            this.updateById(tZhZtjxSyzy);
            return MessageBean.putSuccessMessageBean();
        }
        QueryWrapper<TZhZtjxSyzy> queryWrapper = QueryWrapperUtils.getQueryWrapper(TZhZtjxSyzy.class);
        queryWrapper.eq("mc",tZhZtjxSyzy.getMc());
        List<TZhZtjxSyzy> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该试验专业已存在");
            return messageBean;
        }
        IdGenerator idGenerator = new IdGenerator();
        tZhZtjxSyzy.setObjId(String.valueOf(idGenerator.nextId()));
        this.save(tZhZtjxSyzy);
        return MessageBean.postSuccessMessageBean();
    }

    @Override
    public MessageBean deleteSpeciality(String objId) {
        this.removeById(objId);
        return MessageBean.deleteSuccessMessageBean();
    }
}
