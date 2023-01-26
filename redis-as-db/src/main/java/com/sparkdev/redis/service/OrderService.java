package com.sparkdev.redis.service;

import com.sparkdev.redis.entity.Order;

import java.util.List;
import java.util.UUID;

public interface OrderService {

    Order save(Order order);
    List<Order> findAll();

    Order findOrderById(int id);
    List<Order> findOrderByCustomerId(String customerId);

    Order delete(int id);
}
