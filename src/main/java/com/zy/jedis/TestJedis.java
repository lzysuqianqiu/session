package com.zy.jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.Set;

/**
 * Created by ab804 on 2015/10/16 0016.
 */
public class TestJedis {
    @Test
    public void test() {
//        Jedis jedis = new Jedis("localhost");
//        jedis.set("foo", "bar");
//        String value = jedis.get("foo");
//        System.out.println(value);

        JedisPool pool = new JedisPool(new JedisPoolConfig(), "localhost");

        try (Jedis jedis = pool.getResource()) {

            jedis.set("foo", "bar");
            String foobar = jedis.get("foo");
            jedis.zadd("sose", 0, "car");
            jedis.zadd("sose", 0, "bike");
            Set<String> sose = jedis.zrange("sose", 0, -1);
        }


        pool.destroy();

    }


}
