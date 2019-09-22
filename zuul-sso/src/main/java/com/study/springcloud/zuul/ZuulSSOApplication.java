package com.study.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
@EnableOAuth2Sso
public class ZuulSSOApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulSSOApplication.class, args);
    }
}
