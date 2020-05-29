package com.axy.intelligentcontrolplatform.sys.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.sys.entity.OverhaulUnit;
import com.axy.intelligentcontrolplatform.sys.requestParam.OverHaulUnitParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yct
 * @since 2020-04-30
 */
public interface IOverhaulUnitService extends IService<OverhaulUnit> {
    /**
     * 新增
     * @param name
     * @return
     */
    MessageBean addOverHaulUnit(String name);

    /**
     * 单个删除
     * @param id
     * @return
     */
    MessageBean deleteOverHaulUnit(Long id);

    /**
     * 修改
     * @param overhaulUnit
     * @return
     */
    MessageBean putOverHaulUnit(OverhaulUnit overhaulUnit);

    /**
     * 获取集合
     * @param overHaulUnitParam
     * @return
     */
    MessageBean getOverHaulUnits(OverHaulUnitParam overHaulUnitParam);

}
