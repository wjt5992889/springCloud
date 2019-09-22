package com.study.springcloud.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * http://localhost:8092/ribbon/blog-info
 * 分發到不同的服務
 *  8595从Github仓库中获取得到我博客信息：【NS,,http://www.baidu.com,测试数据】
 *  8660从Github仓库中获取得到我博客信息：【NS,,http://www.baidu.com,测试数据】
 */
@RestController
@RequestMapping(value = "/ribbon")
public class TestRibbonApi {
    /**
     * 注入RestTemplate
     */
    @Autowired
    RestTemplate restTemplate;


    @RequestMapping(value = "/blog-info" ,method = RequestMethod.GET)
    public String testGetNameOfBlog(){
        String url="http://config-client/blog-info";
        return restTemplate.getForObject(url,String.class);
    }
}
