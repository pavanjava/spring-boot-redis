package com.sparkdev.redis.service;

import com.sparkdev.redis.dao.OrderDaoImpl;
import com.sparkdev.redis.entity.Order;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderDaoImpl orderDao;
    private SecureRandom secureRandom;
    public OrderServiceImpl(OrderDaoImpl orderDao) {
        this.orderDao = orderDao;
        this.secureRandom = new SecureRandom();
        secureRandom.setSeed(46);
        System.setProperty("java.util.secureRandomSeed", "true");
    }

    @Override
    public Order save(Order order) {

        order.setId(Math.abs(secureRandom.nextInt()));
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
    public Order findOrderById(int id) {
        return this.orderDao.findById(id).orElse(new Order());
    }

    @Override
    public List<Order> findOrderByCustomerId(String customerId) {
        return null;
    }

    @Override
    public Order delete(int id) {
        return null;
    }
}
