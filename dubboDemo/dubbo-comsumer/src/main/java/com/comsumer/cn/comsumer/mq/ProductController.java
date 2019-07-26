package com.comsumer.cn.comsumer.mq;

import java.util.HashMap;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="rabbit")
public class RabbitmqController<V> {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping(method=RequestMethod.GET)
    public void test(){

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("id", "1");
        map.put("name", "pig");
        //根据key发送到对应的队列
        rabbitTemplate.convertAndSend("que_pig_key", map);

        map.put("id", "2");
        map.put("name", "cat");
        //根据key发送到对应的队列
        rabbitTemplate.convertAndSend("que_cat_key", map);

    }



}
