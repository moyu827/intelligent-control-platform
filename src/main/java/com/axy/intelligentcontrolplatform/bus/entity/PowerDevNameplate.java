package com.axy.intelligentcontrolplatform.bus.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 铭牌参数表
 * </p>
 *
 * @author yct
 * @since 2020-05-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bus_power_dev_nameplate")
public class PowerDevNameplate implements Serializable {

    private static final long serialVersionUID = 1L;

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
     * 设备类型名称
     */
    @TableField(exist = false)
    private String typeName;
    /**
     * 设备厂商名称
     */
    @TableField(exist = false)
    private String manufacturerName;

    /**
     * 设备型号名称
     */
    @TableField(exist = false)
    private String modelName;


}
