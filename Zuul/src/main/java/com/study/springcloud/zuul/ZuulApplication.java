package com.study.springcloud.zuul;

import com.study.springcloud.zuul.filter.AccessTokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {

    /**
     * 加载过滤器
     * @return
     */
    @Bean
    public AccessTokenFilter accessFilter() {
        return new AccessTokenFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
