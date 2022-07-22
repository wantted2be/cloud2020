package com.company.springcloud.lb;

import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.lb
 * @Date 2022/7/6 11:45
 * @Version 1.0
 */
public interface LoadBalancer {
    public ServiceInstance serviceInstance(List<ServiceInstance> serviceInstances);

}
