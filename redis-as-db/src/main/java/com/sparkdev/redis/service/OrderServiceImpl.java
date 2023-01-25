package com.sparkdev.redis.service;

import com.sparkdev.redis.dao.OrderDaoImpl;
import com.sparkdev.redis.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderDaoImpl orderDao;

    public OrderServiceImpl(OrderDaoImpl orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public Order save(Order order) {
        order.setId(UUID.randomUUID());
        double amt = order.getProductPurchase().values().stream().reduce(0.0, Double::sum);
        double tax = (amt * order.getTax()) / 100;
        order.setOrderAmount(amt);
        order.setTotalAmount(amt + tax);

        return this.orderDao.save(order);
    }

    @Override
    public List<Order> findAll() {
        return this.orderDao.findAll();
    }

    // Intentionally left blank for you to implement
    @Override
    public Order findOrderById(UUID id) {
        return null;
    }

    @Override
    public List<Order> findOrderByCustomerId(String customerId) {
        return null;
    }

    @Override
    public Order delete(UUID id) {
        return null;
    }
}
