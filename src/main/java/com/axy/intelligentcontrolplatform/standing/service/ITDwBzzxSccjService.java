package com.axy.intelligentcontrolplatform.standing.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.standing.entity.TDwBzzxSccj;
import com.axy.intelligentcontrolplatform.standing.requestParam.TDwBzzxSccjParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 生产厂家 服务类
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
public interface ITDwBzzxSccjService extends IService<TDwBzzxSccj> {

    /**
     * 新增
     * @param tDwBzzxSccj
     * @return
     */
    MessageBean postMfrs(TDwBzzxSccj tDwBzzxSccj);

    /**
     * 删除
     * @param id
     * @return
     */
    MessageBean deleteMfrs(String id);

    /**
     * 获取集合
     * @param tDwBzzxSccjParam
     * @return
     */
    MessageBean getMfrs(TDwBzzxSccjParam tDwBzzxSccjParam);

    /**
     * 生产厂家下拉框
     * @param tDwBzzxSccj
     * @return
     */
    MessageBean selectMfrs(TDwBzzxSccj tDwBzzxSccj);
}
