package com.company.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud.alibaba.config
 * @Date 2022/7/22 0:18
 * @Version 1.0
 */
@Configuration
@MapperScan({"com.company.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
