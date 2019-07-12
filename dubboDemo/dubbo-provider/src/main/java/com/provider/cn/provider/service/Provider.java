package com.provider.cn.provider.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        System.out.println((context.getDisplayName() + ":here"));
        context.start();
        System.out.println("服务已启动。。。。。。。。");
        System.in.read();
    }

}
