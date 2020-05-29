package com.axy.intelligentcontrolplatform.experiment.entity;

import java.io.Serializable;

import com.axy.intelligentcontrolplatform.basic.requestParam.PageParam;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 试验子项目
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TZhZtjxSyzxm extends PageParam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 子项目ID
     */
    @TableId("obj_id")
    private String objId;

    /**
     * 子项目名称
     */
    private String mc;

    /**
     * 子项目描述
     */
    private String zxmms;

    /**
     * 结果类型(数字、文本、图片)
     */
    private String jglx;

    /**
     * 是否自动计算
     */
    private Long sfzdjs;

    /**
     * 可选值多个可选值时以逗号分隔
     */
    private String kxz;

    /**
     * 数值单位
     */
    private String szdw;

    /**
     * 是否显示
     */
    private Long sfxs;

    /**
     * 编码
     */
    private String bm;
    /**
     * 序号
     */
    @TableField(exist = false)
    private String orderId;


}
