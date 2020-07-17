package com.huazheng.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname CouponMainApplication
 * @Description 优惠券服务
 * @Date 2020/7/17 14:02
 * @Created by zhanghuazheng
 */

@SpringBootApplication
@EnableDiscoveryClient
public class CouponMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(CouponMainApplication.class,args);
    }
}
