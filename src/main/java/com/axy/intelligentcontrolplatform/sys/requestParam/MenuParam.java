package com.axy.intelligentcontrolplatform.sys.requestParam;

import com.axy.intelligentcontrolplatform.basic.requestParam.PageParam;
import lombok.Data;

@Data
public class MenuParam extends PageParam {
    private Long id;
    private String name;
    private Integer type;
}
