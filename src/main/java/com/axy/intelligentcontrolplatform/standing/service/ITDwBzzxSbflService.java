package com.axy.intelligentcontrolplatform.standing.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.standing.entity.TDwBzzxSbfl;
import com.axy.intelligentcontrolplatform.standing.requestParam.TDwBzzxSbflParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 设备类型表 服务类
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
public interface ITDwBzzxSbflService extends IService<TDwBzzxSbfl> {

    /**
     * 查询列表
     * @param param
     * @return
     */
    MessageBean getPartsType(TDwBzzxSbflParam param);

    /**
     * 新增
     * @param tDwBzzxSbfl
     * @return
     */
    MessageBean postPartsType(TDwBzzxSbfl tDwBzzxSbfl);

    /**
     * 删除
     * @param id
     * @return
     */
    MessageBean deletePartsType(String id);

    /**
     * 设备类型下拉框
     * @return
     */
    MessageBean selectPartsType(TDwBzzxSbfl tDwBzzxSbfl);

}
