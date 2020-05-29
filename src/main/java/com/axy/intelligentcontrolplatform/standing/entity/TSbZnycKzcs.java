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
 * 设备部件附件扩展参数表
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_sb_znyc_kzcs")
public class TSbZnycKzcs implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 参数ID
     */
    @TableId("obj_id")
    private String objId;

    /**
     * 部件ID
     */
    private String bjid;

    /**
     * 参数定义ID
     */
    private String csdyid;

    /**
     * 设备类型
     */
    private String sblx;

    /**
     * 参数名称
     */
    private String csmc;

    /**
     * 参数值
     */
    private String csz;

    /**
     * 部件附件名称
     */
    @TableField(exist = false)
    private String bjfjName;
    /**
     * 设备类型名称
     */
    @TableField(exist = false)
    private String sblxName;



}
