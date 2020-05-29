package com.axy.intelligentcontrolplatform.standing.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.standing.entity.TSbZnycKzcs;
import com.axy.intelligentcontrolplatform.standing.requestParam.TSbZnycKzcsParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 设备部件附件扩展参数表 服务类
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
public interface ITSbZnycKzcsService extends IService<TSbZnycKzcs> {

    /**
     * 查询列表
     * @param param
     * @return
     */
    MessageBean getPartsParam(TSbZnycKzcsParam param);

    /**
     * 新增
     * @param tSbZnycKzcs
     * @return
     */
    MessageBean postPartsParam(TSbZnycKzcs tSbZnycKzcs);


    /**
     * 删除
     * @param id
     * @return
     */
    MessageBean deletePartsParam(String id);

}
