package com.axy.intelligentcontrolplatform.standing.requestParam;

import com.axy.intelligentcontrolplatform.basic.requestParam.PageParam;
import lombok.Data;

/**
 * TDwBzzxBzflbParam：
 *
 * @author: li wenqiang
 * @date: 2020/5/14 16:28
 */
@Data
public class TDwBzzxBzflbParam extends PageParam{
    /**
     * 标准分类ID
     */
    private String objId;

    /**
     * 标准分类编码
     */
    private String bzflbm;

    /**
     * 标准分类名称
     */
    private String bzflmc;

    /**
     * 上级分类ID
     */
    private String sjflid;

    /**
     * 是否主数据 包括：0:否 1:是
     */
    private Integer sfzsj;

    /**
     * 专业
     */
    private Integer zy;

    /**
     * 是否国网标准 包括：0:否 1:是
     */
    private Integer sfgwbz;

    /**
     * 备注
     */
    private String bz;

    /**
     * URL
     */
    private String url;

    /**
     * 是否大类 包括：0:否 1:是
     */
    private Integer sfdl;

    /**
     * 国网标准代码
     */
    private String gwbzdm;

    /**
     * 标准分类ID_整型
     */
    private Integer objIdZx;

    /**
     * 标准分类编码_整型
     */
    private Integer bzflbmZx;

    /**
     * 排序
     */
    private Integer px;

}
