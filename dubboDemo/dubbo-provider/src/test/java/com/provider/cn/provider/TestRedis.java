package com.provider.cn.provider;

import com.provider.cn.provider.redis.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {

    @Test
    public void contextLoads() {
    }
    @Resource
    private RedisTemplate<Object, Object> redisTemplate;
    @Test
    public void testSet() {
        Member vo = new Member() ;
        vo.setMid("python");
        vo.setAge(21);

        this.redisTemplate.opsForValue().set("addr", vo);
        this.redisTemplate.expire("addr",10, TimeUnit.SECONDS);
        System.out.println("111");
    }
    @Test
    public void testGet() {
        System.out.println(this.redisTemplate.opsForValue().get("abc"));
    }
}
