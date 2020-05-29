package com.axy.intelligentcontrolplatform.sys.requestParam;

import com.axy.intelligentcontrolplatform.basic.requestParam.PageParam;
import lombok.Data;

@Data
public class OverHaulUnitParam extends PageParam {
    private Long id;
    private String name;
}
