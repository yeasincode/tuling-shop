package com.apollo.cn.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {


    @Value("${name:bdd}")
    String name1;

    @Value("${server.env}")
    String env;

    @GetMapping("hi")
    public String hi(String name) {

        log.debug( "debug log..." );
        log.info( "info log..." );
        log.warn( "warn log..." );

        return "hi " + name + " ,i am from port:"  + "name1" +name1 +"env:"+env;
    }
}
