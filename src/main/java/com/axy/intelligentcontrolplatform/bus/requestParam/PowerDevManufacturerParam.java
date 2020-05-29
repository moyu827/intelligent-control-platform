package com.axy.intelligentcontrolplatform.bus.requestParam;

import com.axy.intelligentcontrolplatform.basic.requestParam.PageParam;
import lombok.Data;

@Data
public class PowerDevManufacturerParam extends PageParam {
    private Long id;
    private String name;
}
