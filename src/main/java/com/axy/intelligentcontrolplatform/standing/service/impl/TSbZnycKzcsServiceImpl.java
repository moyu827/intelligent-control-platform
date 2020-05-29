package com.axy.intelligentcontrolplatform.standing.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.standing.entity.TSbZnycKzcs;
import com.axy.intelligentcontrolplatform.standing.mapper.TSbZnycKzcsMapper;
import com.axy.intelligentcontrolplatform.standing.requestParam.TSbZnycKzcsParam;
import com.axy.intelligentcontrolplatform.standing.service.ITSbZnycKzcsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 设备部件附件扩展参数表 服务实现类
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Service
public class TSbZnycKzcsServiceImpl extends ServiceImpl<TSbZnycKzcsMapper, TSbZnycKzcs> implements ITSbZnycKzcsService {

    @Autowired
    private TSbZnycKzcsMapper tSbZnycKzcsMapper;

    @Override
    public MessageBean getPartsParam(TSbZnycKzcsParam param) {
        Integer currentPage = param.getCurrentPage();
        Integer pageSize = param.getPageSize();
        int modelsCount = tSbZnycKzcsMapper.getPartsParamCount(param);
        List<TSbZnycKzcs> list = new ArrayList<>();
        if(null != currentPage){
            PageHelper.startPage(currentPage,pageSize);
        }

        if(modelsCount > 0){
            list = tSbZnycKzcsMapper.getPartsParam(param);
        }

        return MessageBean.getListSuccessMessageBean(modelsCount,list);
    }

    @Override
    public MessageBean postPartsParam(TSbZnycKzcs tSbZnycKzcs) {
        if(null !=tSbZnycKzcs && !StringUtils.isEmpty(tSbZnycKzcs.getObjId())){
            this.updateById(tSbZnycKzcs);
            return MessageBean.putSuccessMessageBean();
        }
        IdGenerator generator = new IdGenerator();
        tSbZnycKzcs.setObjId(String.valueOf(generator.nextId()));
        this.save(tSbZnycKzcs);
        return MessageBean.postSuccessMessageBean();
    }


    @Override
    public MessageBean deletePartsParam(String id) {
        this.removeById(id);
        return MessageBean.deleteSuccessMessageBean();
    }
}
