package com.study.springcloud.feign.controller;

import com.study.springcloud.feign.service.CloudService;
import com.study.springcloud.feign.service.ConfigClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 博客操作API，对外暴露
 * http://localhost:8093/feign/blog-info
 * feign直接指向config-client的時候，一樣會進行負載均衡
 */
@RestController
@RequestMapping(value = "/feign")
public class BlogController {

    @Autowired
    ConfigClientService configClientService;

    @Autowired
    CloudService cloudService;

    @RequestMapping("/blog-info")
    public String getBlogNameByFeign() {
        return "通过feign方式得到：" + configClientService.getBlogInfo();
    }

    @RequestMapping("/blog-info-cloud")
    public String getCloudBlogNameByFeign() {
        return "通过feign方式得到：" + cloudService.getBlogInfo();
    }
}
