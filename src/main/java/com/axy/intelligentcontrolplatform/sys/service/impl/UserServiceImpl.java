package com.axy.intelligentcontrolplatform.sys.service.impl;

import com.axy.intelligentcontrolplatform.sys.entity.User;
import com.axy.intelligentcontrolplatform.sys.mapper.UserMapper;
import com.axy.intelligentcontrolplatform.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yct
 * @since 2020-04-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser(String username) {
        User user = userMapper.getUser(username);
        String authNameStr = user.getAuthNameStr();
        if(null != authNameStr && !"".equals(authNameStr)){
            List<String> authNameList = new ArrayList<>();
            String[] split = authNameStr.split(",");
            for (String s:split) {
                authNameList.add(s);
            }
            if(authNameList.size() > 0){
                user.setAuthNameList(authNameList);
            }
        }
        return user;
    }
}
