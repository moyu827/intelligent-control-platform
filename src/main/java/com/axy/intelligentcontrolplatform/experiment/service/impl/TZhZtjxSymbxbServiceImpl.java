package com.axy.intelligentcontrolplatform.experiment.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSymbxb;
import com.axy.intelligentcontrolplatform.experiment.mapper.TZhZtjxSymbxbMapper;
import com.axy.intelligentcontrolplatform.experiment.service.ITZhZtjxSymbxbService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 试验模板-相别 服务实现类
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@Service
public class TZhZtjxSymbxbServiceImpl extends ServiceImpl<TZhZtjxSymbxbMapper, TZhZtjxSymbxb> implements ITZhZtjxSymbxbService {

    @Autowired
    TZhZtjxSymbxbMapper tZhZtjxSymbxbMapper;
    @Override
    public MessageBean getTempItems(TZhZtjxSymbxb tZhZtjxSymbxb) {
        Integer currentPage = tZhZtjxSymbxb.getCurrentPage();
        Integer pageSize = tZhZtjxSymbxb.getPageSize();
        int modelsCount = tZhZtjxSymbxbMapper.getTempItemsCount(tZhZtjxSymbxb);
        List<TZhZtjxSymbxb> list = new ArrayList<>();
        if(null != currentPage){
            PageHelper.startPage(currentPage,pageSize);
        }

        if(modelsCount > 0){
            list = tZhZtjxSymbxbMapper.getTempItems(tZhZtjxSymbxb);
        }
        return MessageBean.getListSuccessMessageBean(modelsCount,list);
    }

    @Override
    public MessageBean postTempItems(TZhZtjxSymbxb tZhZtjxSymbxb) {
        if(null != tZhZtjxSymbxb && !StringUtils.isEmpty(tZhZtjxSymbxb.getObjId())){
            this.updateById(tZhZtjxSymbxb);
            return MessageBean.putSuccessMessageBean();
        }
        IdGenerator idGenerator = new IdGenerator();
        tZhZtjxSymbxb.setObjId(String.valueOf(idGenerator.nextId()));
        this.save(tZhZtjxSymbxb);
        return MessageBean.postSuccessMessageBean();
    }

    @Override
    public MessageBean deleteTempItems(String objId) {
        this.removeById(objId);
        return MessageBean.deleteSuccessMessageBean();
    }

    @Override
    public List<TZhZtjxSymbxb> getTempItemsById(String objId) {
        List<TZhZtjxSymbxb> list = new ArrayList<>();
        int modelCount = tZhZtjxSymbxbMapper.getTempItemsByIdCount(objId);
        if(modelCount > 0){
            list = tZhZtjxSymbxbMapper.getTempItemsById(objId);
        }
        return list;
    }
}
