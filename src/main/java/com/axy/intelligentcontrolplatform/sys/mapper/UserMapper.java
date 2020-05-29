package com.axy.intelligentcontrolplatform.sys.mapper;

import com.axy.intelligentcontrolplatform.sys.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yct
 * @since 2020-04-29
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    /**
     * 根据用户名获取用户包括用户的角色和权限
     * @param username
     * @return
     */
    User getUser(String username);

}
