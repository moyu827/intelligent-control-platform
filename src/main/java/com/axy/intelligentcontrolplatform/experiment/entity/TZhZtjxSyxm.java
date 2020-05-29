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
 * 试验项目
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_zh_ztjx_syxm")
public class TZhZtjxSyxm extends PageParam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 试验项目ID
     */
    @TableId("obj_id")
    private String objId;

    /**
     * 试验专业ID
     */
    private String syzyid;

    /**
     * 试验项目名称
     */
    private String mc;

    /**
     * 试验项目描述
     */
    private String xmms;

    /**
     * 显示方式
     */
    private String xsfs;

    /**
     * 子项目定位方式
     */
    private String zxmdwfs;

    /**
     * 是否录入温度
     */
    private Long sflrwd;

    /**
     * 是否录入湿度
     */
    private Long sflrsd;

    /**
     * 是否录入油温
     */
    private Long sflryw;

    /**
     * 是否录入负荷
     */
    private Long sflrfh;

    /**
     * 是否部位可扩展
     */
    private Long sfbwkkz;

    /**
     * 编码
     */
    private String bm;

    /**
     * 相别
     */
    private Long sflrbjxh;


    /**
     * 试验专业名称
     */
    @TableField(exist = false)
    private String syzyName;
}
