package com.company.springcloud.dao.service;

import com.company.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud.service
 * @Date 2022/5/27 20:33
 * @Version 1.0
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
