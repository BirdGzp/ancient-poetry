package com.moon.ancientpoetry.article.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.moon.ancientpoetry.*")
@EnableDiscoveryClient
public class AncientPoetryArticleCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(AncientPoetryArticleCoreApplication.class, args);
    }
}
