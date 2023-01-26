package com.sparkdev.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication(scanBasePackages = "com.sparkdev.redis")
@EnableRedisRepositories
public class RedisAsDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisAsDbApplication.class, args);
    }

}
