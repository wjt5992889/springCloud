package com.study.springcloud.eureka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *  Eureka 服务发现server 启动类
 *  http://localhost:8081/
 *
 *  @EnableEurekaServer:    服务发现服务端注解，设置以后将作为服务注册中心。
 *
 *  @SpringBootApplication：springboot:  启动主程序注解。
 *
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}