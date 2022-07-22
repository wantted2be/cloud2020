package com.company.springcloud.alibaba.service;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud.alibaba.service
 * @Date 2022/7/21 23:53
 * @Version 1.0
 */
public interface StorageService {
    // 扣减库存
    void decrease(Long productId, Integer count);

}
