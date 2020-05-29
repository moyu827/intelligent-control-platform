package com.axy.intelligentcontrolplatform;

import com.axy.intelligentcontrolplatform.basic.utils.IdGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.concurrent.TimeUnit;

@SpringBootTest
class IntelligentControlPlatformApplicationTests {

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    public static void main(String[] args) {
        System.out.println();
    }

    @Test
    void contextLoads() {
        IdGenerator idGenerator = new IdGenerator();
        for (int i = 0; i < 10; i++) {
            System.out.println(idGenerator.nextId());
        }

    }

    @Test
    void add() {
        int MAXIMUM_CAPACITY = 1 << 30;
        int n = 100 - 1;
        System.out.println(n >>> 1);
        System.out.println(99 | 49);
        n |= n >>> 1;
        System.out.println(n);

        n |= n >>> 2;
        System.out.println(n);
        System.out.println(n >>> 2);
        n |= n >>> 4;
        System.out.println(n);
        System.out.println(n >>> 4);
        n |= n >>> 8;
        System.out.println(n);
        System.out.println(n >>> 8);
        n |= n >>> 16;
        System.out.println(n);
        System.out.println(n >>> 16);
        System.out.println((n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1);

    }


    @Test
    void redis(){
        redisTemplate.opsForValue().set("keyone",123,60000,TimeUnit.SECONDS);
        System.out.println(redisTemplate.opsForValue().get("keyone"));
    }
}
