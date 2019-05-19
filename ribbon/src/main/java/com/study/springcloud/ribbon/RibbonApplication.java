package com.study.springcloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *  启动类，示范负载均衡服务器
 *
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class RibbonApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RibbonApplication.class, args);
    }

    /**
     * Spring提供的用于访问Rest服务的客户端
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}