package com.company.springcloud.alibaba.service;

import com.company.springcloud.alibaba.domain.Order;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud.alibaba.service
 * @Date 2022/7/21 22:12
 * @Version 1.0
 */
public interface OrderService {
    void create(Order order);
}
