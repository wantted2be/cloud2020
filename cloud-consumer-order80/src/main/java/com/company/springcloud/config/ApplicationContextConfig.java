package com.company.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud.config
 * @Date 2022/5/28 15:28
 * @Version 1.0
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    //@LoadBalanced  注释掉使用自己写的轮训算法
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
