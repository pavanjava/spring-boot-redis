package com.sparkdev.redis.dao;

import com.sparkdev.redis.entity.Order;
import com.sparkdev.redis.repository.OrdersRepo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Repository
public class OrderDaoImpl {

    Logger logger = Logger.getLogger(OrderDaoImpl.class.getName());
    private final OrdersRepo ordersRepo;

    public OrderDaoImpl(OrdersRepo ordersRepo) {
        this.ordersRepo = ordersRepo;
    }

    public Order save(Order order) {
        return this.ordersRepo.save(order);
    }

    public List<Order> findAll() {
        return (List<Order>) this.ordersRepo.findAll();
    }

    public Optional<Order> findById(int id) {
        logger.info("Fetching the data from database");
        return this.ordersRepo.findById(id);
    }
}
