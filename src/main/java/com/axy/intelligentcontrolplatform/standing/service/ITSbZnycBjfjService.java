package com.axy.intelligentcontrolplatform.standing.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.standing.entity.TSbZnycBjfj;
import com.axy.intelligentcontrolplatform.standing.requestParam.TSbZnycBjfjParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 部件附件 服务类
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
public interface ITSbZnycBjfjService extends IService<TSbZnycBjfj> {

    /**
     * 获取集合
     * @param param
     * @return
     */
    MessageBean getPartsAccessories(TSbZnycBjfjParam param);

    /**
     * 添加
     * @param tSbZnycBjfj
     * @return
     */
    MessageBean postPartsAccessories(TSbZnycBjfj tSbZnycBjfj);


    /**
     * 删除
     * @param id
     * @return
     */
    MessageBean deletePartsAccessories(String id);

    /**
     * 下拉框
     * @param tSbZnycBjfj
     * @return
     */
    MessageBean selectPartsAccessories(TSbZnycBjfj tSbZnycBjfj);
}
