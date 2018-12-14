package com.moon.ancientpoetry.user.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(scanBasePackages={"com.*"})
@EnableCaching
public class AncientPoetryUserWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(AncientPoetryUserWebApplication.class, args);
    }
}
