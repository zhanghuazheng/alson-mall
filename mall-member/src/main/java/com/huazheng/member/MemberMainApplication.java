package com.huazheng.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname MemberMainApplication
 * @Description 会员服务
 * @Date 2020/7/17 14:02
 * @Created by zhanghuazheng
 */

@SpringBootApplication
@EnableDiscoveryClient
public class MemberMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberMainApplication.class,args);
    }
}
