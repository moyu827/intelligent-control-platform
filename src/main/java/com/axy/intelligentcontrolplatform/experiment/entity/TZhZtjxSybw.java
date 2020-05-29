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
 * 试验部位
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_zh_ztjx_sybw")
public class TZhZtjxSybw extends PageParam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 试验部位_ID
     */
    @TableId("obj_id")
    private String objId;

    /**
     * 名称
     */
    private String mc;

    /**
     * 备注
     */
    private String bz;
    /**
     * 排序
     */
    @TableField(exist = false)
    private String orderId;


}
