package com.huazheng.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname ProductMainApplication
 * @Description 商品服务
 * @Date 2020/7/17 10:33
 * @Created by zhanghuazheng
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProductMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductMainApplication.class,args);
    }
}
