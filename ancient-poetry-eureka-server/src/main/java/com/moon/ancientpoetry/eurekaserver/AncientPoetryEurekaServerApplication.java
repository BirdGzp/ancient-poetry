package com.moon.ancientpoetry.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AncientPoetryEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AncientPoetryEurekaServerApplication.class, args);
    }
}
