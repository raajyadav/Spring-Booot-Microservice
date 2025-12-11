package com.jspider.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.jspider.binding.Country;

@Configuration
public class RedisConfig {

    @Bean
    public JedisConnectionFactory jedisConn() {
        JedisConnectionFactory jedis = new JedisConnectionFactory();
        return jedis;
    }

    // ❗ FIXED: Change Integer -> String (match controller)
    @Bean
    public RedisTemplate<String, Country> redisTemplate(JedisConnectionFactory jedisConn){
        RedisTemplate<String, Country> rt = new RedisTemplate<>();
        rt.setConnectionFactory(jedisConn);
        return rt;
    }
}
