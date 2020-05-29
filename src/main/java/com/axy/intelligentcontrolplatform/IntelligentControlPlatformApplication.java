package com.axy.intelligentcontrolplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.axy.intelligentcontrolplatform.*.mapper")
public class IntelligentControlPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntelligentControlPlatformApplication.class, args);
    }

}
