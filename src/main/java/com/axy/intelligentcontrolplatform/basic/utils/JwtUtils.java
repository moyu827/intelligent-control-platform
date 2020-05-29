package com.axy.intelligentcontrolplatform.basic.utils;

import com.axy.intelligentcontrolplatform.sys.entity.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@Component
public class JwtUtils implements Serializable {
    private static final long serialVersionUID = -3301605591108950415L;

    private static final String CLAIM_KEY_USERNAME = "userName";

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private Long expiration;
    //生成token
    public String generateToken(User user) {
        Map<String, Object> claims = new HashMap<>();
        claims.put(CLAIM_KEY_USERNAME, user.getUsername());
        return generateToken(claims);
    }

    private String generateToken(Map<String, Object> claims) {
        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(generateExpirationDate())
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }
    private Date generateExpirationDate() {
        return new Date(System.currentTimeMillis() + expiration * 1000);
    }
    //获取Claims
    private Claims getClaimsFromToken(String token) {
        Claims claims;
        try {
            claims = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
        } catch (Exception e) {
            claims = null;
        }
        return claims;
    }
    //获取用户名
    public String getUserNameFromToken(String token){
        Claims claims = getClaimsFromToken(token);
        String userName = null;
        if(null != claims){
            userName = claims.get(CLAIM_KEY_USERNAME, String.class);
        }
        return userName;
    }


    /**
     * token是否过期
     * @param token
     * @return
     */
    public boolean is_overdue(String token){
        Claims claims = getClaimsFromToken(token);
        Date expirationDate = claims.getExpiration();
        return new Date().before(expirationDate);
    }

    /**
     * 验证token
     * @param token
     * @param info
     * @return
     */
    public Boolean validateToken(String token, UserDetails info) {
        final String username = getUserNameFromToken(token);

        return (username.equals(info.getUsername()));
    }
}
