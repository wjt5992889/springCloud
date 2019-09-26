package com.study.springcloud.eureka;

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
 *  删除注册服务
 *  http://localhost:8761/eureka/apps/CONFIG-CLIENT/localhost:config-client:8310
 * Request Method = DELETE
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