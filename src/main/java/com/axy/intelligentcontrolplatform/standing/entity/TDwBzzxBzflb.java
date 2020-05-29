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
 * 标准分类表
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_dw_bzzx_bzflb")
public class TDwBzzxBzflb implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标准分类ID
     */
    @TableId("obj_id")
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

    /**
     * 父名称
     */
    @TableField(exist = false)
    private String parentName;


}
