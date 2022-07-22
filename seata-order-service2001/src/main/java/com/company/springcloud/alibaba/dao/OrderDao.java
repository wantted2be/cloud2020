package com.company.springcloud.alibaba.dao;

import com.company.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud.alibaba.dao
 * @Date 2022/7/21 21:28
 * @Version 1.0
 */
@Mapper
public interface OrderDao {

    //1.新建订单
    void create(Order order);

    //2.修改订单状态  0--1
    void update(@Param("userId") Long userId,@Param("status")Integer status);
}
