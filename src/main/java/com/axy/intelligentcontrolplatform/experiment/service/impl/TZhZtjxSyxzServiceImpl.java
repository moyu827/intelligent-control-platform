package com.axy.intelligentcontrolplatform.experiment.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.basic.utils.QueryWrapperUtils;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSyxm;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSyxz;
import com.axy.intelligentcontrolplatform.experiment.mapper.TZhZtjxSyxzMapper;
import com.axy.intelligentcontrolplatform.experiment.service.ITZhZtjxSyxzService;
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
 * 试验性质 服务实现类
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@Service
public class TZhZtjxSyxzServiceImpl extends ServiceImpl<TZhZtjxSyxzMapper, TZhZtjxSyxz> implements ITZhZtjxSyxzService {

    @Autowired
    TZhZtjxSyxzMapper tZhZtjxSyxzMapper;

    @Override
    public MessageBean getNature(TZhZtjxSyxz tZhZtjxSyxz) {
        Integer currentPage = tZhZtjxSyxz.getCurrentPage();
        Integer pageSize = tZhZtjxSyxz.getPageSize();
        int modelsCount = tZhZtjxSyxzMapper.getNatureCount(tZhZtjxSyxz);
        List<TZhZtjxSyxz> list = new ArrayList<>();
        if(null != currentPage){
            PageHelper.startPage(currentPage,pageSize);
        }

        if(modelsCount > 0){
            list = tZhZtjxSyxzMapper.getNature(tZhZtjxSyxz);
        }
        return MessageBean.getListSuccessMessageBean(modelsCount,list);
    }

    @Override
    public MessageBean postNature(TZhZtjxSyxz tZhZtjxSyxz) {
        if(null != tZhZtjxSyxz && !StringUtils.isEmpty(tZhZtjxSyxz.getObjId())){
            QueryWrapper<TZhZtjxSyxz> queryWrapper = QueryWrapperUtils.getQueryWrapper(TZhZtjxSyxz.class);
            queryWrapper.eq("mc",tZhZtjxSyxz.getMc());
            List<TZhZtjxSyxz> list = this.list(queryWrapper);
            if(list.size() > 0){
                MessageBean messageBean = new MessageBean();
                messageBean.setStatus("fail");
                messageBean.setMessage("该试验性质已存在");
                return messageBean;
            }
            this.updateById(tZhZtjxSyxz);
            return MessageBean.putSuccessMessageBean();
        }
        QueryWrapper<TZhZtjxSyxz> queryWrapper = QueryWrapperUtils.getQueryWrapper(TZhZtjxSyxz.class);
        queryWrapper.eq("mc",tZhZtjxSyxz.getMc());
        List<TZhZtjxSyxz> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该试验性质已存在");
            return messageBean;
        }
        IdGenerator idGenerator = new IdGenerator();
        tZhZtjxSyxz.setObjId(String.valueOf(idGenerator.nextId()));
        this.save(tZhZtjxSyxz);
        return MessageBean.postSuccessMessageBean();
    }

    @Override
    public MessageBean deleteNature(String objId) {
        this.removeById(objId);
        return MessageBean.deleteSuccessMessageBean();
    }
}
