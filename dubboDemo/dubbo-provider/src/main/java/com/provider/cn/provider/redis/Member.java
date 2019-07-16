package com.provider.cn.provider.redis;

import lombok.Data;

import java.io.Serializable;
/**
 * @author hubin
 */
@Data
public class Member implements Serializable {
    private String mid;
    private Integer age;
}
