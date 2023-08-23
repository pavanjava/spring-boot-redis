package com.sparkdev.redis.subscriber.listeners;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparkdev.redis.subscriber.dto.Notification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedisMessageSubscriber {
    private static final Logger LOGGER = LoggerFactory.getLogger(RedisMessageSubscriber.class);
    private ObjectMapper objectMapper = new ObjectMapper();

    public void receiveMessage(String message) throws JsonProcessingException {
        LOGGER.info("Received < " + message + ">");
        Notification notification = objectMapper.readValue(message, Notification.class);
        LOGGER.info("Converted : "+notification.toString());
    }
}
