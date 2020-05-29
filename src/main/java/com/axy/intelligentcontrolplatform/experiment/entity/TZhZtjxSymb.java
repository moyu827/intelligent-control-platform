package com.axy.intelligentcontrolplatform.experiment.entity;

import java.io.Serializable;

import com.axy.intelligentcontrolplatform.basic.requestParam.PageParam;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 试验模板
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_zh_ztjx_symb")
public class TZhZtjxSymb extends PageParam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 试验模板ID
     */
    @TableId("obj_id")
    private String objId;

    /**
     * 试验模板名称
     */
    private String mc;

    /**
     * 设备类型编码
     */
    private String sblxbm;

    /**
     * 是否默认，0 否，1 是
     */
    private Long sfmr;

    /**
     * 是否停用，0 否，1 是
     */
    private Long sfty;

    /**
     * 序号
     */
    private Long xh;

    /**
     * 父模板ID
     */
    private String fmbid;

    /**
     * 适用电压等级
     */
    private String sydydj;

    /**
     * 父模板名称
     */
    @TableField(exist = false)
    private String parentName;
    /**
     * 设备类型名称
     */
    @TableField(exist = false)
    private String sblxmc;


}
