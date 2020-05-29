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
 * 试验性质
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_zh_ztjx_syxz")
public class TZhZtjxSyxz extends PageParam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 试验性质ID
     */
    @TableId("obj_id")
    private String objId;

    /**
     * 试验专业ID
     */
    private String syzyid;

    /**
     * 试验性质名称
     */
    private String mc;

    /**
     * 序号
     */
    private Long xh;

    /**
     * 试验专业名称
     */
    @TableField(exist = false)
    private String syzyName;

}
