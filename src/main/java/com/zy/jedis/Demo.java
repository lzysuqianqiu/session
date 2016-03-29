package com.zy.jedis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.net.URL;

/**
 * Created by ab804 on 2015/10/16 0016.
 */
public class Demo {
    @Autowired
    private RedisTemplate<String, String> template;

    @Resource(name = "redisTemplate")
    private ListOperations<String, String> listOps;

    public void addLink(String id, URL url) {
        listOps.leftPush(id, url.toExternalForm());
    }


}
