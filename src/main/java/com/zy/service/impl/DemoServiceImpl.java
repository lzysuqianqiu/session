package com.zy.service.impl;

import com.zy.service.DemoService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by ab804 on 2015/10/16 0016.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {


    @Cacheable(value = "str")
    public String put() {
        System.out.println("无缓存");
        return "ok";

    }


}
