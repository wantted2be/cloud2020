package com.company.springcloud.service;

import com.company.springcloud.entities.CommonResult;
import com.company.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud.service
 * @Date 2022/7/20 22:59
 * @Version 1.0
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService
{
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
