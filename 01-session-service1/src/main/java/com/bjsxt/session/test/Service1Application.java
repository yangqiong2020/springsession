package com.bjsxt.session.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession(redisNamespace="myspringsession")
public class Service1Application {
    public static void main(String[] args){
        SpringApplication.run(Service1Application.class,args);
    }
}
