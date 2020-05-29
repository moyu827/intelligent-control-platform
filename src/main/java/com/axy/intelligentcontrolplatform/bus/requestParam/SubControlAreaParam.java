package com.axy.intelligentcontrolplatform.bus.requestParam;

import com.axy.intelligentcontrolplatform.basic.requestParam.PageParam;
import lombok.Data;

import java.util.List;

@Data
public class SubControlAreaParam extends PageParam {

    /**
     * 主键
     */
    private Long id;

    /**
     * 子控区名称
     */
    private String name;

    /**
     * 上级区域id
     */
    private Long parentId;

    /**
     * 类型集合
     * 1:省级；2：市级；3：线级
     */
    private List<Integer> types;

    /**
     * 类型
     */
    private Integer type;
}
