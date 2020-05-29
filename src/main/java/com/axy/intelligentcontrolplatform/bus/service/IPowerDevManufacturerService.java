package com.axy.intelligentcontrolplatform.bus.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.bus.entity.PowerDevManufacturer;
import com.axy.intelligentcontrolplatform.bus.requestParam.PowerDevManufacturerParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 电力设备厂商表 服务类l
 * </p>
 *
 * @author yct
 * @since 2020-05-07
 */
public interface IPowerDevManufacturerService extends IService<PowerDevManufacturer> {
    /**
     * 新增
     * @param name
     * @return
     */
    MessageBean addPowerDevManufacturer(String name);

    /**
     * 单个删除
     * @param id
     * @return
     */
    MessageBean deletePowerDevManufacturer(Long id);

    /**
     * 修改
     * @param devManufacturer
     * @return
     */
    MessageBean putPowerDevManufacturer(PowerDevManufacturer devManufacturer);

    /**
     * 获取集合
     * @param powerDevManufacturerParam
     * @return
     */
    MessageBean getPowerDevManufacturers(PowerDevManufacturerParam powerDevManufacturerParam);
}
