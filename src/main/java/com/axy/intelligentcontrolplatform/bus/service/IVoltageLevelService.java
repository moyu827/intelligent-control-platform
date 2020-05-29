package com.axy.intelligentcontrolplatform.bus.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.bus.entity.VoltageLevel;
import com.axy.intelligentcontrolplatform.bus.requestParam.VoltageLevelParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 电压等级表 服务类
 * </p>
 *
 * @author yct
 * @since 2020-05-11
 */
public interface IVoltageLevelService extends IService<VoltageLevel> {
    /**
     * 新增
     * @param voltageLevel
     * @return
     */
    MessageBean addVoltageLevel(VoltageLevel voltageLevel);

    /**
     * 单个删除
     * @param id
     * @return
     */
    MessageBean deleteVoltageLevel(Long id);

    /**
     * 修改
     * @param voltageLevel
     * @return
     */
    MessageBean putVoltageLevel(VoltageLevel voltageLevel);

    /**
     * 获取集合
     * @param voltageLevelParam
     * @return
     */
    MessageBean getVoltageLevels(VoltageLevelParam voltageLevelParam);

}
