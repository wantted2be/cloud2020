package com.company.springcloud.comtroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud.comtroller
 * @Date 2022/7/15 11:16
 * @Version 1.0
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping(value = "/configInfo")
    public String getConfigInfo(){
        return "serverPort: " + serverPort + "\t" + "configInfo: " + configInfo;
    }
}
