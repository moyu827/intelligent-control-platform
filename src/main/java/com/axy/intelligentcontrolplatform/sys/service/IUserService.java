package com.axy.intelligentcontrolplatform.sys.service;

import com.axy.intelligentcontrolplatform.sys.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yct
 * @since 2020-04-29
 */
public interface IUserService extends IService<User> {
    /**
     * 根据用户名获取用户包括用户的角色和权限
     * @param username
     * @return
     */
    User getUser(String username);

}
