package com.comsumer.cn.comsumer.service;

import com.api.cn.api.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-comsumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService bean = context.getBean(DemoService.class);
        System.out.println("sonsumer");
        System.out.println(bean.getPermissions(1L));
    }
}
