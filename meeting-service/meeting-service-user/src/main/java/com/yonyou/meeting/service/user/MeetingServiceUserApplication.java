package com.yonyou.meeting.service.user;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author cuimc
 * @since 2020-06-12
 */

@SpringBootApplication
@EnableDubbo
public class MeetingServiceUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeetingServiceUserApplication.class,args);
    }
}
