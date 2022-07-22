package com.company.springcloud.service;

import com.company.springcloud.entities.CommonResult;
import com.company.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud.service
 * @Date 2022/7/20 23:00
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
