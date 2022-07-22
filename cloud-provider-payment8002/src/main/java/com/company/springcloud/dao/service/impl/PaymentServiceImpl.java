package com.company.springcloud.dao.service.impl;

import com.company.springcloud.dao.PaymentDao;
import com.company.springcloud.dao.service.PaymentService;
import com.company.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud.service.impl
 * @Date 2022/5/27 20:34
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
