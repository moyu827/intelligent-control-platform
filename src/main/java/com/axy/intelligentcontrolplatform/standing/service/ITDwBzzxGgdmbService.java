package com.axy.intelligentcontrolplatform.standing.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.standing.entity.TDwBzzxGgdmb;
import com.axy.intelligentcontrolplatform.standing.requestParam.TDwBzzxGgdmbParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 公共代码表 服务类
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
public interface ITDwBzzxGgdmbService extends IService<TDwBzzxGgdmb> {

    /**
     * 查询集合
     * @param param
     * @return
     */
    MessageBean getCommonCode(TDwBzzxGgdmbParam param);

    /**
     * 新增
     * @param tDwBzzxGgdmb
     * @return
     */
    MessageBean postCommonCode(TDwBzzxGgdmb tDwBzzxGgdmb);


    /**
     * 删除
     * @param id
     * @return
     */
    MessageBean deleteCommonCode(String id);

}
