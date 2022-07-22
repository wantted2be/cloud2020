package com.company.springcloud.service;

import com.company.springcloud.entities.CommonResult;
import com.company.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud.service
 * @Date 2022/7/7 11:25
 * @Version 1.0
 */
@Component
@Configuration
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")  //feign组件的接口
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
