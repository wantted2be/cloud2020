package com.company.springcloud.alibaba.domain;

import lombok.Data;

/**
 * @Author wlb10
 * @PackageName cloud2020
 * @Package com.company.springcloud.alibaba.domain
 * @Date 2022/7/21 23:47
 * @Version 1.0
 */
@Data
public class Storage {
    private Long id;

    // 产品id
    private Long productId;

    //总库存
    private Integer total;


    //已用库存
    private Integer used;


    //剩余库存
    private Integer residue;

}
