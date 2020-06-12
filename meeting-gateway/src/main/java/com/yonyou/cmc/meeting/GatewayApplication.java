package com.yonyou.cmc.meeting;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 网关启动类
 */
@SpringBootApplication
@EnableDubboConfig
public class GatewayApplication {


    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class,args);
    }
}
