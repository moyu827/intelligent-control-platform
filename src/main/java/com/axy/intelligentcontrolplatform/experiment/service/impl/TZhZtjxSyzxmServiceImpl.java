package com.axy.intelligentcontrolplatform.experiment.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.basic.utils.QueryWrapperUtils;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSyxm;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSyzxm;
import com.axy.intelligentcontrolplatform.experiment.mapper.TZhZtjxSyzxmMapper;
import com.axy.intelligentcontrolplatform.experiment.service.ITZhZtjxSyzxmService;
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
 * 试验子项目 服务实现类
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@Service
public class TZhZtjxSyzxmServiceImpl extends ServiceImpl<TZhZtjxSyzxmMapper, TZhZtjxSyzxm> implements ITZhZtjxSyzxmService {

    @Autowired
    TZhZtjxSyzxmMapper tZhZtjxSyzxmMapper;
    @Override
    public MessageBean getSubProject(TZhZtjxSyzxm tZhZtjxSyzxm) {
        Integer currentPage = tZhZtjxSyzxm.getCurrentPage();
        Integer pageSize = tZhZtjxSyzxm.getPageSize();
        int modelsCount = tZhZtjxSyzxmMapper.getSubProjectCount(tZhZtjxSyzxm);
        List<TZhZtjxSyzxm> list = new ArrayList<>();
        if(null != currentPage){
            PageHelper.startPage(currentPage,pageSize);
        }

        if(modelsCount > 0){
            list = tZhZtjxSyzxmMapper.getSubProject(tZhZtjxSyzxm);
        }
        return MessageBean.getListSuccessMessageBean(modelsCount,list);
    }

    @Override
    public MessageBean postSubProject(TZhZtjxSyzxm tZhZtjxSyzxm) {
        if(null != tZhZtjxSyzxm && !StringUtils.isEmpty(tZhZtjxSyzxm.getObjId())){
            QueryWrapper<TZhZtjxSyzxm> queryWrapper = QueryWrapperUtils.getQueryWrapper(TZhZtjxSyzxm.class);
            queryWrapper.eq("mc",tZhZtjxSyzxm.getMc());
            List<TZhZtjxSyzxm> list = this.list(queryWrapper);
            if(list.size() > 0){
                MessageBean messageBean = new MessageBean();
                messageBean.setStatus("fail");
                messageBean.setMessage("该子项目名称已存在");
                return messageBean;
            }
            this.updateById(tZhZtjxSyzxm);
            return MessageBean.putSuccessMessageBean();
        }
        QueryWrapper<TZhZtjxSyzxm> queryWrapper = QueryWrapperUtils.getQueryWrapper(TZhZtjxSyzxm.class);
        queryWrapper.eq("mc",tZhZtjxSyzxm.getMc());
        List<TZhZtjxSyzxm> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该子项目名称已存在");
            return messageBean;
        }
        IdGenerator idGenerator = new IdGenerator();
        tZhZtjxSyzxm.setObjId(String.valueOf(idGenerator.nextId()));
        this.save(tZhZtjxSyzxm);
        return MessageBean.postSuccessMessageBean();
    }

    @Override
    public MessageBean deleteSubProject(String objId) {
        this.removeById(objId);
        return MessageBean.deleteSuccessMessageBean();
    }

    @Override
    public List<TZhZtjxSyzxm> getSubProjectByProjectId(String objId) {
        return tZhZtjxSyzxmMapper.getSubProjectByProjectId(objId);
    }
}
