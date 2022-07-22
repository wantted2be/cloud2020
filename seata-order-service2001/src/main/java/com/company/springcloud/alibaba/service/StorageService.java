package com.company.springcloud.alibaba.service;

import com.company.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud.alibaba.service
 * @Date 2022/7/21 22:19
 * @Version 1.0
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    @PostMapping("/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count);
}
