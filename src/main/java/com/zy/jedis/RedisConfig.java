package com.zy.jedis;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

/**
 * Created by ab804 on 2015/10/16 0016.
 */
public class RedisConfig {

    @Bean
    public RedisConnectionFactory jedisConnectionFactory() {
        RedisSentinelConfiguration sentinelConfig = new RedisSentinelConfiguration().master("master")
                .sentinel("127.0.0.1", 26379).sentinel("127.0.0.1", 26380);
        return new JedisConnectionFactory(sentinelConfig);
    }
}
