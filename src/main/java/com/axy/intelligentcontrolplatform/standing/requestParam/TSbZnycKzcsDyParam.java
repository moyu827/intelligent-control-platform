package com.axy.intelligentcontrolplatform.standing.requestParam;

import com.axy.intelligentcontrolplatform.basic.requestParam.PageParam;
import lombok.Data;

/**
 * TSbZnycKzcsDyParam：
 *
 * @author: li wenqiang
 * @date: 2020/5/14 16:32
 */
@Data
public class TSbZnycKzcsDyParam extends PageParam{
    /**
     * 参数定义ID
     */
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

}
