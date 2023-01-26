package com.sparkdev.redis.publisher.service;

import com.sparkdev.redis.publisher.dto.Notification;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessagePublisher {

    private final RedisTemplate<String, Object> redisTemplate;
    private static final String CHANNEL_NAME = "notification";

    public MessagePublisher(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void publish(Notification notification) {
        redisTemplate.convertAndSend(CHANNEL_NAME, notification);
    }
}
