package com.sparkdev.redis.publisher.controller;

import com.sparkdev.redis.publisher.dto.Notification;
import com.sparkdev.redis.publisher.service.MessagePublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publish")
public class PublisherController {

    private final MessagePublisher messagePublisher;

    public PublisherController(MessagePublisher messagePublisher) {
        this.messagePublisher = messagePublisher;
    }

    @PostMapping()
    public void publish(@RequestBody Notification notification){
        this.messagePublisher.publish(notification);
    }
}
