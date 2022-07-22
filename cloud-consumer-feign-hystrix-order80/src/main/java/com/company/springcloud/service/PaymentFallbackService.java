package com.company.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud.service
 * @Date 2022/7/11 23:22
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "---PaymentFallbackService fall back-paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "---PaymentFallbackService fall back-paymentInfo_Timeout";
    }
}
