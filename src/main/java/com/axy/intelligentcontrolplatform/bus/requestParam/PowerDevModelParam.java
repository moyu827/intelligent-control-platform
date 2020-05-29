package com.axy.intelligentcontrolplatform.bus.requestParam;

import com.axy.intelligentcontrolplatform.basic.requestParam.PageParam;
import lombok.Data;

@Data
public class PowerDevModelParam extends PageParam {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 电力设备型号名称
     */
    private String name;

    /**
     * 电力设备类型id
     */
    private Long typeId;

    /**
     * 电力设备厂商id
     */
    private Long manufacturerId;

    /**
     * 电力设备类型名称
     */
    private String typeName;

    /**
     * 电力设备厂商名称
     */
    private String manufacturerName;
}
