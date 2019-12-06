package com.bjsxt.session.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;

@Configuration
public class SpringSessionConfig {

    /**
     * 更换默认的序列化器
     *
     */
    @Bean("springSessionDefaultRedisSerializer")
    public RedisSerializer defaultRedisSerializer(){
        return getSerizlizer();
    }
    /**
     * 定义序列化器
     */
    private RedisSerializer getSerizlizer(){
        return new GenericJackson2JsonRedisSerializer();
    }
}
