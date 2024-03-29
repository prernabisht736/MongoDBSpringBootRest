package com.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class MongoDBSpringBootRestApplication {
    public static void main(String[] args) {
        // new comment added
        SpringApplication.run(MongoDBSpringBootRestApplication.class, args);
    }
}
