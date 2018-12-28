package com.moon.ancientpoetry.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableHystrix
@ComponentScan("com.moon.ancientpoetry.*")
public class AncientPoetryWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AncientPoetryWebApplication.class, args);
    }

}

