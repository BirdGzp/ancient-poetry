package com.moon.ancientpoetry.user.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.moon.ancientpoetry.*")
@EnableEurekaClient
public class AncientPoetryUserCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(AncientPoetryUserCoreApplication.class, args);
    }
}
