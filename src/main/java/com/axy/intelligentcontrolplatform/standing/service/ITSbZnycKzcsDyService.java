package com.axy.intelligentcontrolplatform.standing.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.standing.entity.TSbZnycKzcsDy;
import com.axy.intelligentcontrolplatform.standing.requestParam.TSbZnycKzcsDyParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 设备部件附件扩展参数定义表(库) 服务类
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
public interface ITSbZnycKzcsDyService extends IService<TSbZnycKzcsDy> {

    /**
     * 查询列表
     * @param param
     * @return
     */
    MessageBean getPartsParamDefine(TSbZnycKzcsDyParam param);

    /**
     * 新增
     * @param tSbZnycKzcsDy
     * @return
     */
    MessageBean postPartsParamDefine(TSbZnycKzcsDy tSbZnycKzcsDy);


    /**
     * 删除
     * @param id
     * @return
     */
    MessageBean deletePartsParamDefine(String id);

    /**
     * 下拉框查询
     * @param tSbZnycKzcsDy
     * @return
     */
    MessageBean selectPartsParamDefine(TSbZnycKzcsDy tSbZnycKzcsDy);

}
