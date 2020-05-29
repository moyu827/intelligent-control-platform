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
 * 公共代码表
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_dw_bzzx_ggdmb")
public class TDwBzzxGgdmb implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公共代码ID
     */
    @TableId("obj_id")
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
    /**
     * 标准分类名称
     */
    @TableField(exist = false)
    private String bzflName;
}
