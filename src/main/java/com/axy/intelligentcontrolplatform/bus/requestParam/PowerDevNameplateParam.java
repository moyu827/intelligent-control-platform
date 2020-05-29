package com.axy.intelligentcontrolplatform.bus.requestParam;

import com.axy.intelligentcontrolplatform.basic.requestParam.PageParam;
import lombok.Data;

@Data
public class PowerDevNameplateParam extends PageParam {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 参数名称
     */
    private String name;

    /**
     * 参数值
     */
    private String value;

    /**
     * 电力设备型号id
     */
    private Long modelId;
    /**
     * 电力设备类型名称
     */
    private String modelName;

    /**
     * 电力设备类型名称
     */
    private String typeName;

    /**
     * 电力设备厂商名称
     */
    private String manufacturerName;
}
