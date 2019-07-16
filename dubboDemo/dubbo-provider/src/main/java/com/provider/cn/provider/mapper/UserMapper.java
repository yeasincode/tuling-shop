package com.provider.cn.provider.mapper;

import com.provider.cn.provider.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface UserMapper {
    @Select("select * from user where id=#{id}")
    User Sel(@Param("id") int id);
}
