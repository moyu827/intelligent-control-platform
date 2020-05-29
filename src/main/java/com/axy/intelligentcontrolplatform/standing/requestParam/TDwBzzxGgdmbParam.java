package com.axy.intelligentcontrolplatform.standing.requestParam;

import com.axy.intelligentcontrolplatform.basic.requestParam.PageParam;
import lombok.Data;

/**
 * TDwBzzxGgdmbParam：
 *
 * @author: li wenqiang
 * @date: 2020/5/14 16:26
 */
@Data
public class TDwBzzxGgdmbParam extends PageParam{
    /**
     * 公共代码ID
     */
    private String objId;

    /**
     * 标准分类编码
     */
    private String bzflbm;

    /**
     * 代码
     */
    private String dm;

    /**
     * 代码名称
     */
    private String dmmc;

    /**
     * 备注
     */
    private String bz;

    /**
     * 标准分类obj_id
     */
    private String bzflid;

    /**
     * 排序
     */
    private Integer px;

    /**
     * 标准分类ID_整型
     */
    private Integer bzflidZx;

    /**
     * 标准分类编码_整型
     */
    private Integer bzflbmZx;

    /**
     * 代码_整型
     */
    private Integer dmZx;

    /**
     * 是否启用 包括：0:否 1:是
     */
    private Integer sfqy;
}
