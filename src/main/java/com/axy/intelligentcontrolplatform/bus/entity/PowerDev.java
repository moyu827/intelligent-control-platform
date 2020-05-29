package com.axy.intelligentcontrolplatform.bus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 电力设备表
 * </p>
 *
 * @author yct
 * @since 2020-05-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bus_power_dev")
public class PowerDev implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 设备名称
     */
    private String name;

    /**
     * 设备类型id
     */
    private Long typeId;

    /**
     * 生产厂商id
     */
    private Long manufacturerId;

    /**
     * 间隔id
     */
    private Long bayId;

    /**
     * 出厂编号
     */
    private String serialNumber;

    /**
     * 出厂日期
     */
    private LocalDateTime serialDate;

    /**
     * 设备状态（1在用、0停役）
     */
    private Boolean state;


}
