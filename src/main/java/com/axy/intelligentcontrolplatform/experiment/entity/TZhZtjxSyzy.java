package com.axy.intelligentcontrolplatform.experiment.entity;

import java.io.Serializable;

import com.axy.intelligentcontrolplatform.basic.requestParam.PageParam;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 试验专业
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_zh_ztjx_syzy")
public class TZhZtjxSyzy extends PageParam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 试验专业ID
     */
    @TableId("obj_id")
    private String objId;

    /**
     * 试验专业名称
     */
    private String mc;

    /**
     * 序号
     */
    private String xh;


}
