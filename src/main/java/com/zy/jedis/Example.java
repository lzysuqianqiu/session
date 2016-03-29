package com.zy.jedis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.net.URL;

/**
 * Created by ab804 on 2015/10/16 0016.
 */
public class Example {
    @Autowired
    private StringRedisTemplate redisTemplate;

    public void addLink(String id, URL url) {
        redisTemplate.opsForList().leftPush(id, url.toExternalForm());
    }


}
