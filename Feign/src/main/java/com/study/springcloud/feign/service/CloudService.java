package com.study.springcloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("cloud-service")
public interface CloudService {

    @GetMapping("/blog-info")
    String getBlogInfo();
}
