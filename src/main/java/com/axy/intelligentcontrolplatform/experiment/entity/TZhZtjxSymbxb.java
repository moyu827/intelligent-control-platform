package com.axy.intelligentcontrolplatform.experiment.entity;

import java.io.Serializable;
import java.util.List;

import com.axy.intelligentcontrolplatform.basic.requestParam.PageParam;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 试验模板-相别
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_zh_ztjx_symbxb")
public class TZhZtjxSymbxb extends PageParam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 唯一标识
     */
    @TableId("obj_id")
    private String objId;

    /**
     * 模板项目ID
     */
    private String mbxmid;

    /**
     * 试验相别
     */
    private String syxb;

    /**
     * 设备相别，01 A相，02 B相，03 C相，04 ABC相，05 ABCO，06 O相，07 中性点，08 备用相，09 /，10 AB相，11 CA相，12 BC相，13 AN相，14 BN相，15 CN相
     */
    private String sbxb;

    /**
     * 序号
     */
    private Long xh;

    /**
     * 排序
     */
    @TableField(exist = false)
    private String orderId;

    /**
     * 项目列表
     */
    @TableField(exist = false)
    private List<TZhZtjxSybw> positionList;


}
