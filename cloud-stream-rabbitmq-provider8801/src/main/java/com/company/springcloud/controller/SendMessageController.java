package com.company.springcloud.controller;

import com.company.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud.controller
 * @Date 2022/7/17 13:10
 * @Version 1.0
 */
@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider iMessageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage(){
        return iMessageProvider.send();
    }
}
