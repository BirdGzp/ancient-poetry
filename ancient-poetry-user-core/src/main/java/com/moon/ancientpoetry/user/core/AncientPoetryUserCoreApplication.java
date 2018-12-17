package com.moon.ancientpoetry.user.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.moon.ancientpoetry.*")
public class AncientPoetryUserCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(AncientPoetryUserCoreApplication.class, args);
    }
}
