package com.axy.intelligentcontrolplatform.standing.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.standing.entity.TSbZnycKzcsDy;
import com.axy.intelligentcontrolplatform.standing.mapper.TSbZnycKzcsDyMapper;
import com.axy.intelligentcontrolplatform.standing.requestParam.TSbZnycKzcsDyParam;
import com.axy.intelligentcontrolplatform.standing.service.ITSbZnycKzcsDyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 设备部件附件扩展参数定义表(库) 服务实现类
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Service
public class TSbZnycKzcsDyServiceImpl extends ServiceImpl<TSbZnycKzcsDyMapper, TSbZnycKzcsDy> implements ITSbZnycKzcsDyService {

    @Autowired
    private TSbZnycKzcsDyMapper tSbZnycKzcsDyMapper;

    @Override
    public MessageBean getPartsParamDefine(TSbZnycKzcsDyParam param) {
        Integer currentPage = param.getCurrentPage();
        Integer pageSize = param.getPageSize();
        int modelsCount = tSbZnycKzcsDyMapper.getPartsParamDefineCount(param);
        List<TSbZnycKzcsDy> list = new ArrayList<>();
        if(null != currentPage){
            PageHelper.startPage(currentPage,pageSize);
        }

        if(modelsCount > 0){
            list = tSbZnycKzcsDyMapper.getPartsParamDefine(param);
        }

        return MessageBean.getListSuccessMessageBean(modelsCount,list);
    }

    @Override
    public MessageBean postPartsParamDefine(TSbZnycKzcsDy tSbZnycKzcsDy) {
        if(null != tSbZnycKzcsDy && !StringUtils.isEmpty(tSbZnycKzcsDy.getObjId())){
            this.updateById(tSbZnycKzcsDy);
            return MessageBean.putSuccessMessageBean();
        }
        IdGenerator idGenerator = new IdGenerator();
        tSbZnycKzcsDy.setObjId(String.valueOf(idGenerator.nextId()));
        this.save(tSbZnycKzcsDy);
        return MessageBean.postSuccessMessageBean();
    }


    @Override
    public MessageBean deletePartsParamDefine(String id) {
        this.removeById(id);
        return MessageBean.deleteSuccessMessageBean();
    }

    @Override
    public MessageBean selectPartsParamDefine(TSbZnycKzcsDy tSbZnycKzcsDy) {
        List<TSbZnycKzcsDy> list = tSbZnycKzcsDyMapper.selectPartsParamDefine(tSbZnycKzcsDy);
        return MessageBean.getOneSuccessMessageBean(list);
    }
}
