package com.yonyou.cmc.meeting.controller.demo;

import com.yonyou.meeting.api.service.DemoHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 崔梦超
 * @since 2020-06-12
 */
@RestController
@RequestMapping("/demo/hello")
public class HelloController {

    @Reference(interfaceClass = DemoHelloService.class,check = false)
    DemoHelloService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(String name,String message){

        return demoService.sayHello(name,message).toString();
    }
}
