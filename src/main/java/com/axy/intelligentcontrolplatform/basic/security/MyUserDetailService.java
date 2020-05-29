package com.axy.intelligentcontrolplatform.basic.security;

import com.axy.intelligentcontrolplatform.sys.entity.User;
import com.axy.intelligentcontrolplatform.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private IUserService userService;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userService.getUser(s);
        if(null == user){
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", s));
        }else{
            Set<GrantedAuthority> authorities = new HashSet<>();
            List<String> authNameList = user.getAuthNameList();
            String username = user.getUsername();
            String password = user.getPassword();
            if(null != authNameList && authNameList.size() > 0){
                List<SimpleGrantedAuthority> collect = authNameList.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());
                authorities.addAll(collect);
            }
            return new JwtUser(username,password,true,true,true,true,authorities);
        }

    }
}
