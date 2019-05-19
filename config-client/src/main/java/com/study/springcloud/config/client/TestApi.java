package com.study.springcloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8091/blog-info
 */

@RefreshScope
@RestController
public class TestApi {

    @Value("${myblog.name}")
    private String name;
    @Value("${myblog.url}")
    private String url;
    @Value("${myblog.location}")
    private String location;
    @Value("${server.port}")
    private String port ;
    @RequestMapping("/blog-info")
    public String getBlogInfo() {
        return port+"从Github仓库中获取得到我博客信息：【"+location+","+","+url+","+name+"】";
    }
}
