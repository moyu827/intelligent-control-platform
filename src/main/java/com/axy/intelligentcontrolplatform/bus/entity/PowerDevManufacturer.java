package com.axy.intelligentcontrolplatform.bus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 电力设备厂商表
 * </p>
 *
 * @author yct
 * @since 2020-05-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bus_power_dev_manufacturer")
public class PowerDevManufacturer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 电力设备厂商名称
     */
    private String name;


}
