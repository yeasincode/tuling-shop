package com.provider.cn.provider.service;

import com.provider.cn.provider.mapper.UserMapper;
import com.provider.cn.provider.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User Sel(int id){
        return userMapper.Sel(id);
    }
}
