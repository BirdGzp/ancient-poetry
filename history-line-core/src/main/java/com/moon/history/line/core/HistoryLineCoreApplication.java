package com.moon.history.line.core;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/30 18:20
 * @Description:
 */
@SpringBootApplication
@ComponentScan("com.moon.history.*")
@EnableEurekaClient
public class HistoryLineCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(HistoryLineCoreApplication.class, args);
    }
}
