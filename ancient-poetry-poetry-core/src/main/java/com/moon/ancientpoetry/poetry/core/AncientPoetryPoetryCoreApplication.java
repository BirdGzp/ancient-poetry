package com.moon.ancientpoetry.poetry.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AncientPoetryPoetryCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(AncientPoetryPoetryCoreApplication.class, args);
    }
}
