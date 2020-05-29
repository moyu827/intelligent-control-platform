package com.axy.intelligentcontrolplatform.sys.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.sys.entity.User;
import com.axy.intelligentcontrolplatform.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yct
 * @since 2020-04-29
 */
@RestController
@RequestMapping("/sys/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @GetMapping("GET/current-user")
    public MessageBean getCurrentUser(){
        MessageBean messageBean = new MessageBean();
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
        User user = userService.getUser(name);
        messageBean.setStatus("success");
        messageBean.setMessage("请求成功");
        messageBean.setRows(user);
        return messageBean;
    }

}
