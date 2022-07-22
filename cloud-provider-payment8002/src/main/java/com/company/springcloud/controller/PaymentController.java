package com.company.springcloud.controller;

import com.company.springcloud.entities.CommonResult;
import com.company.springcloud.entities.Payment;
import com.company.springcloud.dao.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud.controller
 * @Date 2022/5/27 20:38
 * @Version 1.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*******插入结果:" + result);
        if(result > 0){
            return new CommonResult(200,"插入数据库，success,servePort:" + serverPort,result);
        }else{
            return new CommonResult(444, "插入数据库，failed",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("+++++++++查询结果：" + payment);
        if(payment != null){
            return new CommonResult(200,"查询数据，success,servePort:" + serverPort,payment);
        }else{
            return new CommonResult(444,"没有对应记录，查询id:" + id,null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }

}
