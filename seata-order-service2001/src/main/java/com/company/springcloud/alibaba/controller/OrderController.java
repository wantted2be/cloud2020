package com.company.springcloud.alibaba.controller;

import com.company.springcloud.alibaba.domain.CommonResult;
import com.company.springcloud.alibaba.domain.Order;
import com.company.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud.alibaba.controller
 * @Date 2022/7/21 22:42
 * @Version 1.0
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
