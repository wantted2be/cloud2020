package com.company.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud.config
 * @Date 2022/7/13 20:34
 * @Version 1.0
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouterLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_company", r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }
}
