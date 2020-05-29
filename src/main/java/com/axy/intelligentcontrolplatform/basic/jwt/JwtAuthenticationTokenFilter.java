package com.axy.intelligentcontrolplatform.basic.jwt;

import com.alibaba.fastjson.JSONObject;
import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.basic.security.MyUserDetailService;
import com.axy.intelligentcontrolplatform.basic.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Component
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {

    @Autowired
    private MyUserDetailService myUserDetailService;

    @Autowired
    private JwtUtils jwtToken;
    @Value("${jwt.header}")
    private String tokenHeader;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain chain) throws ServletException, IOException {
        String authHeader = request.getHeader(this.tokenHeader);
        MessageBean messageBean = new MessageBean();
        response.setCharacterEncoding("UTF-8");
        String requestURI = request.getRequestURI();
        boolean b = requestURI.startsWith("/auth");
        if(null != authHeader && !b ){
            if(!authHeader.startsWith(tokenHead)){
                addMessageToResponse(response,messageBean);
                return;
            }
            final String token = authHeader.substring(tokenHead.length());
            String username = jwtToken.getUserNameFromToken(token);
            if(null == username || "".equals(username)){
                addMessageToResponse(response,messageBean);
                return;
            }
            UserDetails userDetails = null;
            try {
                userDetails = this.myUserDetailService.loadUserByUsername(username);
            }catch (UsernameNotFoundException e){
                e.printStackTrace();
            }

            if(null == userDetails){
                addMessageToResponse(response,messageBean);
                return;
            }

            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
                    userDetails, null, userDetails.getAuthorities());
            authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(
                    request));
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }


//        if (authHeader != null && authHeader.startsWith(tokenHead)) {
//            final String authToken = authHeader.substring(tokenHead.length()); // The part after "Bearer "
//            String username = jwtTokenUtil.getUsernameFromToken(authToken);
//            Claims claims = jwtTokenUtil.getClaims(authToken);
//            logger.info("checking authentication " + username);
//            if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//                UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
//                if (jwtTokenUtil.validateToken(authToken, userDetails)) {
//                    UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
//                            userDetails, null, userDetails.getAuthorities());
//                    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(
//                            request));
//                    logger.info("authenticated user " + username + ", setting security context");
//                    SecurityContextHolder.getContext().setAuthentication(authentication);
//                }
//            }
//        }

        chain.doFilter(request, response);
    }

    private void  addMessageToResponse(HttpServletResponse response, MessageBean messageBean) throws  IOException {
        messageBean.setStatus("fail");
        messageBean.setMessage("token异常");
        String s = JSONObject.toJSONString(messageBean);
        response.getWriter().print(s);
    }
}
