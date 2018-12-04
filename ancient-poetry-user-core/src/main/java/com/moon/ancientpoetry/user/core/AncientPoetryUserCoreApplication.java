package com.moon.ancientpoetry.user.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.moon.ancientpoetry.user.core.mapper")
public class AncientPoetryUserCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(AncientPoetryUserCoreApplication.class, args);
    }
}
