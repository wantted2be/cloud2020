package com.company.springcloud.alibaba.controller;

import com.company.springcloud.alibaba.domain.CommonResult;
import com.company.springcloud.alibaba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud.alibaba.controller
 * @Date 2022/7/21 23:56
 * @Version 1.0
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    //扣减库存
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }

}
