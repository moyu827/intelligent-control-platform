package com.axy.intelligentcontrolplatform.standing.service.impl;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import com.axy.intelligentcontrolplatform.basic.utils.QueryWrapperUtils;
import com.axy.intelligentcontrolplatform.standing.entity.TDwBzzxGgdmb;
import com.axy.intelligentcontrolplatform.standing.mapper.TDwBzzxGgdmbMapper;
import com.axy.intelligentcontrolplatform.standing.requestParam.TDwBzzxGgdmbParam;
import com.axy.intelligentcontrolplatform.standing.service.ITDwBzzxGgdmbService;
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
 * 公共代码表 服务实现类
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Service
public class TDwBzzxGgdmbServiceImpl extends ServiceImpl<TDwBzzxGgdmbMapper, TDwBzzxGgdmb> implements ITDwBzzxGgdmbService {

    @Autowired
    private TDwBzzxGgdmbMapper tDwBzzxGgdmbMapper;

    @Override
    public MessageBean getCommonCode(TDwBzzxGgdmbParam param) {
        Integer currentPage = param.getCurrentPage();
        Integer pageSize = param.getPageSize();
        int modelsCount = tDwBzzxGgdmbMapper.getCommonCodeCount(param);
        List<TDwBzzxGgdmb> list = new ArrayList<>();
        if(null != currentPage){
            PageHelper.startPage(currentPage,pageSize);
        }

        if(modelsCount > 0){
            list = tDwBzzxGgdmbMapper.getCommonCode(param);
        }

        return MessageBean.getListSuccessMessageBean(modelsCount,list);
    }

    @Override
    public MessageBean postCommonCode(TDwBzzxGgdmb tDwBzzxGgdmb) {
        if(null != tDwBzzxGgdmb && !StringUtils.isEmpty(tDwBzzxGgdmb.getObjId())){
            QueryWrapper<TDwBzzxGgdmb> queryWrapper = QueryWrapperUtils.getQueryWrapper(TDwBzzxGgdmb.class);
            queryWrapper.eq("dmmc",tDwBzzxGgdmb.getDmmc());
            List<TDwBzzxGgdmb> list = this.list(queryWrapper);
            if(list.size() > 0){
                MessageBean messageBean = new MessageBean();
                messageBean.setStatus("fail");
                messageBean.setMessage("该代码名称已存在");
                return messageBean;
            }
            this.updateById(tDwBzzxGgdmb);
            return MessageBean.putSuccessMessageBean();
        }
        QueryWrapper<TDwBzzxGgdmb> queryWrapper = QueryWrapperUtils.getQueryWrapper(TDwBzzxGgdmb.class);
        queryWrapper.eq("dmmc",tDwBzzxGgdmb.getDmmc());
        List<TDwBzzxGgdmb> list = this.list(queryWrapper);
        if(list.size() > 0){
            MessageBean messageBean = new MessageBean();
            messageBean.setStatus("fail");
            messageBean.setMessage("该代码名称已存在");
            return messageBean;
        }
        IdGenerator idGenerator = new IdGenerator();
        tDwBzzxGgdmb.setObjId(String.valueOf(idGenerator.nextId()));
        this.save(tDwBzzxGgdmb);
        return MessageBean.postSuccessMessageBean();
    }

    @Override
    public MessageBean deleteCommonCode(String id) {
        this.removeById(id);
        return MessageBean.deleteSuccessMessageBean();
    }
}
