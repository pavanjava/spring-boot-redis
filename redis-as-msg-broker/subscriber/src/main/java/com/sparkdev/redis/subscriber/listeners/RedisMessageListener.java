package com.sparkdev.redis.subscriber.listeners;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparkdev.redis.subscriber.dto.Notification;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class RedisMessageListener implements MessageListener {

    ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public void onMessage(Message message, byte[] pattern) {

        try{
            Notification notification = objectMapper.readValue(message.toString(), Notification.class);
            System.out.println(notification.toString());
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
