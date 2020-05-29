package com.axy.intelligentcontrolplatform.bus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 变电站表
 * </p>
 *
 * @author yct
 * @since 2020-05-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bus_sub_station")
public class SubStation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 变电站名称
     */
    private String name;

    /**
     * 电压等级id
     */
    private Long voltageId;

    /**
     * 子控区id
     */
    private Long areaId;


}
