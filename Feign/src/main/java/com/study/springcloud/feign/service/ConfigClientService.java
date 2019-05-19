package com.study.springcloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 通过在本服务的service层直接调用其他服务的api层的API接口进行相关操作。
 *   config-client 是一个简单服务，测试返回一个获取博客名称的接口。
 */
@FeignClient("config-client")
public interface ConfigClientService {

    @GetMapping("/blog-info")
    String getBlogInfo();
}
