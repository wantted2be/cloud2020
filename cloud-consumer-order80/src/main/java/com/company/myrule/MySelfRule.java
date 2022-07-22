package com.company.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.myrule
 * @Date 2022/7/5 13:02
 * @Version 1.0
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();  //定义为随机
    }
}
