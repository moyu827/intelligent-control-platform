package com.axy.intelligentcontrolplatform.standing.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 设备部件附件扩展参数定义表(库)
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_sb_znyc_kzcs_dy")
public class TSbZnycKzcsDy implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 参数定义ID
     */
    @TableId("obj_id")
    private String objId;

    /**
     * 设备类型
     */
    private String sblx;

    /**
     * 型号
     */
    private String csmc;

    /**
     * 生产厂家
     */
    private String sjlx;

    /**
     * 计量单位
     */
    private String jldw;

    /**
     * 中午注释：标准代码，是和否。包括：1 是， 0 否
     */
    private Integer sfxl;

    /**
     * 属性含义 维护SQL
     */
    private String sxhy;

    /**
     * 编辑器类型
     */
    private String bjqlx;

    /**
     * 精度
     */
    private Integer jd;

    /**
     * 中午注释：标准代码，是和否。包括：1 是， 0 否
     */
    private String sfbt;

    /**
     * 字段长度
     */
    private Integer zdcd;
    /**
     * 设备类型名称
     */
    @TableField(exist = false)
    private String sblxName;
}
