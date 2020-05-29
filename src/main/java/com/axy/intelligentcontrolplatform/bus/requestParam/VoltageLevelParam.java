package com.axy.intelligentcontrolplatform.bus.requestParam;

import com.axy.intelligentcontrolplatform.basic.requestParam.PageParam;
import lombok.Data;

@Data
public class VoltageLevelParam extends PageParam {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 电压基准值
     */
    private Integer value;
}
