package com.company.springcloud.dao;

import com.company.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud.dao
 * @Date 2022/5/27 16:19
 * @Version 1.0
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
