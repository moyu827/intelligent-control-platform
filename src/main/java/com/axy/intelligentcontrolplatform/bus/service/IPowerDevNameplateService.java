package com.axy.intelligentcontrolplatform.bus.service;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.bus.entity.PowerDevNameplate;
import com.axy.intelligentcontrolplatform.bus.requestParam.PowerDevNameplateParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 铭牌参数表 服务类
 * </p>
 *
 * @author yct
 * @since 2020-05-07
 */
public interface IPowerDevNameplateService extends IService<PowerDevNameplate> {
    /**
     * 新增
     * @param powerDevNameplate
     * @return
     */
    MessageBean addPowerDevNameplate(PowerDevNameplate powerDevNameplate);

    /**
     * 单个删除
     * @param id
     * @return
     */
    MessageBean deletePowerDevNameplate(Long id);

    /**
     * 修改
     * @param powerDevModel
     * @return
     */
    MessageBean putPowerDevNameplate(PowerDevNameplate powerDevModel);

    /**
     * 获取集合
     * @param powerDevNameplateParam
     * @return
     */
    MessageBean getPowerDevNameplates(PowerDevNameplateParam powerDevNameplateParam);
}
