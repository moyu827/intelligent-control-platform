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
 * 设备类型表
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_dw_bzzx_sbfl")
public class TDwBzzxSbfl implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设备分类ID
     */
    @TableId("obj_id")
    private String objId;

    /**
     * 设备类型编码
     */
    private String sblxbm;

    /**
     * 设备类型
     */
    private String sblx;

    /**
     * 父设备类型ID
     */
    private String fsblxid;

    /**
     * 适用专业
     */
    private String syzy;

    /**
     * 是否分相 包括：0:否 1:是
     */
    private Integer sffx;

    /**
     * 是否有调度铭牌
     */
    private Integer sfyddmp;

    /**
     * 备注
     */
    private String bz;

    /**
     * 设备类型编码_整型
     */
    private Integer sblxbmZx;

    /**
     * 设备类型名称
     */
    private String sblxmc;

    /**
     * 适用专业_整型
     */
    private Integer syzyZx;

    /**
     * 是否几何类型 包括：0:否 1:是
     */
    private Integer sfjhlx;

    /**
     * 是否容器 包括：0:否 1:是
     */
    private Integer sfrq;

    /**
     * 是否挂牌 包括：0:否 1:是
     */
    private Integer sfgp;

    /**
     * 图形台帐标识（0、无1、图形2、台帐3、图形和台帐）
     */
    private Integer txtzbs;

    /**
     * 图形表名
     */
    private String txbm;

    /**
     * 台帐表名
     */
    private String tzbm;

    /**
     * 电气逻辑分类
     */
    private Integer dqljfl;

    /**
     * 设备网络分类
     */
    private Integer sbwlfl;

    /**
     * 要素类集合
     */
    private String ysljh;

    /**
     * 是否有附件 包括：0:否 1:是
     */
    private Integer sfyfj;

    /**
     * 电压等级下限
     */
    private String dydjxx;

    /**
     * 主设备ID
     */
    private String zsbid;

    /**
     * 主设备名称
     */
    private String zsbmc;

    /**
     * 计量单位
     */
    private String jldw;

    /**
     * 是否启用 包括：0:否 1:是
     */
    private Integer sfqy;

    /**
     * 是否总部维护型号(为1则该类设备的型号由总部维护)
     */
    private Integer sfzbwhxh;

    /**
     * 是否为首次同步OMS类型
     */
    private Integer sctboms;

    /**
     * 同步OMS条件
     */
    private String omsfilter;

    /**
     * 是否同步台账:0:否1:是(无铭牌有台账设备全部同步台账)
     */
    private Integer sftbtz;

    /**
     * 排序字段2(为仪器仪表用)
     */
    private String pxzd2;
    /**
     * 父类名称
     */
    @TableField(exist = false)
    private String parentName;


}
