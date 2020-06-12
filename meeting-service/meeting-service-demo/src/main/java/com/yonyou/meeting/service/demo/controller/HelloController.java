package com.yonyou.meeting.service.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 崔梦超
 * @since 2020-06-12
 */
@RestController
@RequestMapping("/demo/hello")
public class HelloController {


    @RequestMapping("/sayHello")
    public String sayHello(){

        return "hello dubbo demo";
    }
}
