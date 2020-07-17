package com.huazheng.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname OrderMainApplication
 * @Description 订单服务
 * @Date 2020/7/17 14:02
 * @Created by zhanghuazheng
 */

@SpringBootApplication
@EnableDiscoveryClient

public class OrderMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderMainApplication.class,args);
    }
}
