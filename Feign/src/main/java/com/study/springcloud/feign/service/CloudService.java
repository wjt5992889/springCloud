package com.study.springcloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 2种写法
 * 1.@FeignClient("ribbon-client") 未使用熔断器 hystrix
 * 2.@FeignClient(value = "ribbon-client",fallback = HiSendImpl.class) 打开熔断器
 */
@FeignClient("ribbon-client")
public interface CloudService {

    @GetMapping("/ribbon/blog-info")
    String getBlogInfo();
}
