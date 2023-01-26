package com.sparkdev.redis.subscriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Subscriber {
    private static final Logger LOGGER = LoggerFactory.getLogger(Subscriber.class);

    public void receiveMessage(String message) {
        LOGGER.info("Received <" + message + ">");

    }
}
