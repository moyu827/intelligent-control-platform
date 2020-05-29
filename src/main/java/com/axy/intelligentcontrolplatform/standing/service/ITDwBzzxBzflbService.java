package com.axy.intelligentcontrolplatform.standing.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.standing.entity.TDwBzzxBzflb;
import com.axy.intelligentcontrolplatform.standing.requestParam.TDwBzzxBzflbParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 标准分类表 服务类
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
public interface ITDwBzzxBzflbService extends IService<TDwBzzxBzflb> {

    /**
     * 查询集合
     * @param param
     * @return
     */
    MessageBean getNormalSort(TDwBzzxBzflbParam param);

    /**
     * 新增/修改
     * @param tDwBzzxBzflb
     * @return
     */
    MessageBean postNormalSort(TDwBzzxBzflb tDwBzzxBzflb);

    /**
     * 删除
     * @param id
     * @return
     */
    MessageBean deleteNormalSort(String id);

    MessageBean selectNormalSort(TDwBzzxBzflb tDwBzzxBzflb);

}
