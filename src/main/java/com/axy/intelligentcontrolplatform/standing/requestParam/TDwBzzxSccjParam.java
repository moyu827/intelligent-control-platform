package com.axy.intelligentcontrolplatform.standing.requestParam;

import com.axy.intelligentcontrolplatform.basic.requestParam.PageParam;
import lombok.Data;

/**
 * TDwBzzxSccjParam：
 *
 * @author: li wenqiang
 * @date: 2020/5/14 10:52
 */
@Data
public class TDwBzzxSccjParam extends PageParam {
    /**
     * 生产厂家ID
     */
    private String objId;

    /**
     * 生产厂家编码
     */
    private String sccjbm;

    /**
     * 生产厂家名称
     */
    private String sccjmc;

    /**
     * 曾用名
     */
    private String cym;

    /**
     * 国家
     */
    private String gj;

    /**
     * 城市
     */
    private String cs;

    /**
     * 地址
     */
    private String dz;

    /**
     * 是否可见 包括：0:否 1:是
     */
    private Integer sfsc;

    /**
     * 联系方式
     */
    private String lxfs;

    /**
     * 备注
     */
    private String bz;

    /**
     * MDM编码
     */
    private String mdmbm;

    /**
     * 设备大类编码
     */
    private String sbdlbm;

    /**
     * 设备大类名称
     */
    private String sbdlmc;

    /**
     * 设备类型编码
     */
    private String sblxbm;

    /**
     * 设备类型名称
     */
    private String sblxmc;

    /**
     * 地区
     */
    private String dq;

    /**
     * 经营范围
     */
    private String jyfw;

    /**
     * 厂商识别信息，包括：01电能质量仪表。
     */
    private String cssbxx;

    /**
     * 家族号唯一标识
     */
    private String fomdid;
}