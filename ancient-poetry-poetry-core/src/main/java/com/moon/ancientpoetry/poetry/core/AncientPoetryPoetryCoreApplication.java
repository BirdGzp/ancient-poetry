package com.moon.ancientpoetry.poetry.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.moon.ancientpoetry.poetry.core.mapper")
@SpringBootApplication
public class AncientPoetryPoetryCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(AncientPoetryPoetryCoreApplication.class, args);
    }
}
