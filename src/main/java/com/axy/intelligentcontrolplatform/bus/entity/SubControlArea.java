package com.axy.intelligentcontrolplatform.bus.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 子控区表
 * </p>
 *
 * @author yct
 * @since 2020-05-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bus_sub_control_area")
public class SubControlArea implements Serializable {

    private static final long serialVersionUID = 1L;

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
     * 1:省级；2：市级；3：线级
     */
    private Integer type;

    @TableField(exist = false)
    private String parentName;


}
