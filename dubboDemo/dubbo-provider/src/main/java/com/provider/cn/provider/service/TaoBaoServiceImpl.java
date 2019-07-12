package com.provider.cn.provider.service;

import com.api.cn.api.service.ITaoBaoService;

import java.util.ArrayList;
import java.util.List;

public class TaoBaoServiceImpl implements ITaoBaoService {
    @Override
    public List<String> shppingCart() {
        List list = new ArrayList();
        list.add("11");
        return list;
    }
}
