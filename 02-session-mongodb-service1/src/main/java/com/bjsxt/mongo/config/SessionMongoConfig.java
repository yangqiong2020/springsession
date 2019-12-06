package com.bjsxt.mongo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.mongo.JacksonMongoSessionConverter;

/**
 * 更换Spring Session MongoDB的序列化器
 */
@Configuration
public class SessionMongoConfig {
    @Bean
    JacksonMongoSessionConverter mongoSessionConverter() {
        return new JacksonMongoSessionConverter();
    }
}
