package com.study.springcloud.feign.hystrix;

import com.study.springcloud.feign.service.ConfigClientService;
import org.springframework.stereotype.Component;

@Component
public class HystrixImpl implements ConfigClientService {
    @Override
    public String getBlogInfo() {
        return "failed,this is hystrix";
    }
}
