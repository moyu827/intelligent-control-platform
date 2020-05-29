package com.axy.intelligentcontrolplatform.bus.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.bus.entity.PowerDevType;
import com.axy.intelligentcontrolplatform.bus.requestParam.PowerDevTypeParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 电力设备类型表 服务类
 * </p>
 *
 * @author yct
 * @since 2020-05-07
 */
public interface IPowerDevTypeService extends IService<PowerDevType> {
    /**
     * 新增
     * @param name
     * @return
     */
    MessageBean addPowerDevType(String name);

    /**
     * 单个删除
     * @param id
     * @return
     */
    MessageBean deletePowerDevType(Long id);

    /**
     * 修改
     * @param powerDevType
     * @return
     */
    MessageBean putPowerDevType(PowerDevType powerDevType);

    /**
     * 获取集合
     * @param powerDevTypeParam
     * @return
     */
    MessageBean getPowerDevTypes(PowerDevTypeParam powerDevTypeParam);
}
