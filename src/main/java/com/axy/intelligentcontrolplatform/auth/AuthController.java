package com.axy.intelligentcontrolplatform.auth;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.utils.JwtUtils;
import com.axy.intelligentcontrolplatform.sys.entity.User;
import com.axy.intelligentcontrolplatform.sys.service.IUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/auth")
public class AuthController {
    @Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private IUserService userService;
    @Autowired
    private JwtUtils jwtUtils;

    @PostMapping("/web/passWord/login")
    public MessageBean webLogin(String username, String password) {
        MessageBean messageBean = new MessageBean();
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        User user = userService.getOne(queryWrapper);
        if (null == user) {
            messageBean.setStatus("fail");
            messageBean.setMessage("用户不存在");
            return messageBean;
        }
        String userPassword = user.getPassword();
        boolean matches = passwordEncoder.matches(password, userPassword);
        if (!matches) {
            messageBean.setStatus("fail");
            messageBean.setMessage("用户名或密码错误");
            return messageBean;
        }
        String token = jwtUtils.generateToken(user);
        messageBean.setMessage("登陆成功");
        messageBean.setStatus("success");
        Map<String, Object> map = new HashMap<>();
        map.put("headerKey", "Authorization");
        map.put("headerValue", "Bearer " + token);
        map.put("userInfo",user);
        messageBean.setRows(map);
        return messageBean;
    }


}
