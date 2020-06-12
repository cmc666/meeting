package com.yonyou.meeting.service.demo.service;

import com.yonyou.meeting.api.entity.HelloEntity;
import com.yonyou.meeting.api.service.DemoHelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * 样例demo实现类
 * @author cuimc
 * @since 2020-06-12
 */
@Component
@Service(interfaceClass = DemoHelloService.class)
public class DemoHelloServiceImpl implements DemoHelloService {

    @Override
    public HelloEntity sayHello(String name, String message) {
        HelloEntity entity = new HelloEntity();
        entity.setName(name);
        entity.setMessage(message);
        return entity;
    }
}
