package com.study.springcloud.feign.service;

import com.study.springcloud.feign.hystrix.HystrixImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 通过在本服务的service层直接调用其他服务的api层的API接口进行相关操作。
 *   config-client 是一个简单服务，测试返回一个获取博客名称的接口。
 *
 *   2种写法
 *  * 1.@FeignClient("ribbon-client") 未使用熔断器 hystrix
 *  * 2.@FeignClient(value = "config-client",fallback = HystrixImpl.class)打开熔断器
 */
@FeignClient(value = "config-client",fallback = HystrixImpl.class)
public interface ConfigClientService {

    @GetMapping("/blog-info")
    String getBlogInfo();
}
