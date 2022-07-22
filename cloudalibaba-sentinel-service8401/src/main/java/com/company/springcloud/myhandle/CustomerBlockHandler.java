package com.company.springcloud.myhandle;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.company.springcloud.entities.CommonResult;
import com.company.springcloud.entities.Payment;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud.myhandle
 * @Date 2022/7/20 19:45
 * @Version 1.0
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
