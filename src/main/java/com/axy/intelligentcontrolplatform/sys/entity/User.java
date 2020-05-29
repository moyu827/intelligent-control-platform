package com.axy.intelligentcontrolplatform.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author yct
 * @since 2020-04-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    @TableField("aliasName")
    private String aliasName;

    /**
     * 所属单位id
     */
    @TableField("unitId")
    private Long unitId;

    @TableField(exist = false)
    private String authNameStr;
    @TableField(exist = false)
    private String roleStr;
    @TableField(exist = false)
    private List<String> authNameList;
    @TableField(exist = false)
    private List<String> roleNameList;
    @TableField(exist = false)
    private String roleIdStr;


}
