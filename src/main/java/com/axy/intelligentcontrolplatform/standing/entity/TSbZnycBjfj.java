package com.axy.intelligentcontrolplatform.standing.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
 * 部件附件
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_sb_znyc_bjfj")
public class TSbZnycBjfj implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部件ID
     */
    @TableId("obj_id")
    private String objId;

    /**
     * 所属设备
     */
    private String sssb;

    /**
     * 设备编码;	设备类型的设备都具有该编码
     */
    private String sbbm;

    /**
     * 设备名称
     */
    private String sbmc;

    /**
     * 设备类型
     */
    private String sblx;

    /**
     * 型号
     */
    private String xh;

    /**
     * 生产厂家
     */
    private String sccj;

    /**
     * 制造国家
     */
    private String zzgj;

    /**
     * 出厂编号
     */
    private String ccbh;

    /**
     * 出厂日期
     */
    private LocalDate ccrq;

    /**
     * 投运日期
     */
    private LocalDate tyrq;

    /**
     * 产品代号
     */
    private String cpdh;

    /**
     * 站房
     */
    private String zf;

    /**
     * 所属地市
     */
    private String ssds;

    /**
     * 运维单位
     */
    private String ywdw;

    /**
     * 维护班组
     */
    private String whbz;

    /**
     * 登记时间
     */
    private LocalDateTime djsj;

    /**
     * 设备主人
     */
    private String sbzr;

    /**
     * 所属地市名称
     */
    private String ssdsmc;

    /**
     * 运维单位名称
     */
    private String ywdwmc;

    /**
     * 维护班组名称
     */
    private String whbzmc;

    /**
     * 设备主人名称
     */
    private String sbzrmc;

    /**
     * 设备类型名称
     */
    private String sblxmc;

    /**
     * 运行状态 包括：31:现场留用 32:库存备用 20:在运 30:退役 40:报废 10:未投运 33:待报废
     */
    private String yxzt;

    /**
     * 备注
     */
    private String bz;

    /**
     * 所属设备名称
     */
    private String sssbmc;

    /**
     * 站房名称
     */
    private String zfmc;

    /**
     * 发布状态包括：录入、发布默认发布
     */
    private String fbzt;

    /**
     * 备注
     */
    private String bz1;

    /**
     * 专业分类 包括：1输电2变电3配电
     */
    private String zyfl;

    /**
     * 修改后设备名称
     */
    private String xghsbmc;

    /**
     * 新增数据来源，0代表来源于本地主站和APP端，1代表来源于ERP
     */
    private String sjly;

    /**
     * 生产厂家名称
     */
    @TableField(exist = false)
    private String sccjName;
    /**
     * 设备类型名称
     */
    @TableField(exist = false)
    private String sblxName;
}
