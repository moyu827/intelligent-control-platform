package com.axy.intelligentcontrolplatform.bus.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.bus.entity.PowerDevModel;
import com.axy.intelligentcontrolplatform.bus.entity.PowerDevType;
import com.axy.intelligentcontrolplatform.bus.requestParam.PowerDevModelParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 电力设备型号表 服务类
 * </p>
 *
 * @author yct
 * @since 2020-05-07
 */
public interface IPowerDevModelService extends IService<PowerDevModel> {
    /**
     * 新增
     * @param powerDevModel
     * @return
     */
    MessageBean addPowerDevModel(PowerDevModel powerDevModel);

    /**
     * 单个删除
     * @param id
     * @return
     */
    MessageBean deletePowerDevModel(Long id);

    /**
     * 修改
     * @param powerDevModel
     * @return
     */
    MessageBean putPowerDevModel(PowerDevModel powerDevModel);

    /**
     * 获取集合
     * @param powerDevModelParam
     * @return
     */
    MessageBean getPowerDevModels(PowerDevModelParam powerDevModelParam);

}
