package com.yonyou.meeting.api.service;

import com.yonyou.meeting.api.entity.HelloEntity;

/**
 * @author cuimc
 * @since 2020-06-12
 */
public interface DemoHelloService {

    /**
     * 执行hello方法
     * @param name 名称
     * @param message 消息
     * @return
     */
    HelloEntity sayHello(String name,String message);

}
