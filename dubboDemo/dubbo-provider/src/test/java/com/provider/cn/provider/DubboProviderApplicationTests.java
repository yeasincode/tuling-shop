package com.provider.cn.provider;

import com.provider.cn.provider.mapper.BookMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboProviderApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Autowired
    private BookMapper bookMapper;
    @Test
    public void getBookById(){
        System.out.println(bookMapper.findBookById(654645L));
    }
}
