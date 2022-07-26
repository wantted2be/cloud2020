package com.company.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud
 * @Date 2022/7/7 18:39
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker  //注册使用服务降级
public class PaymentHystrixMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain8001.class,args);
    }

    /*
    * 此配置是为了服务监控而配置，与服务容错本身无关，springcloud升级后的坑
    * ServletRegistrationBean因为springboot的默认路径不是“/hystrix.stream”
    * 只要在自己的项目配置上下面的servlet就可以。
    * */
    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
