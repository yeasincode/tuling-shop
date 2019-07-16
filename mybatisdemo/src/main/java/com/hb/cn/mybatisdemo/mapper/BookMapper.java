package com.hb.cn.mybatisdemo.mapper;

import com.hb.cn.mybatisdemo.pojo.Book;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface BookMapper {
    @Select("select * from book where bookId=#{bookId}")
    Book findBookById(@Param("bookId") Long bookId);
}
