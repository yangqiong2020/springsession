package com.bjsxt.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.mongo.config.annotation.web.http.EnableMongoHttpSession;

@SpringBootApplication
@EnableMongoHttpSession(collectionName="sxtcollection")
public class Mongo1Application {
    public static void main(String[] args){
        SpringApplication.run(Mongo1Application.class,args);
    }
}
