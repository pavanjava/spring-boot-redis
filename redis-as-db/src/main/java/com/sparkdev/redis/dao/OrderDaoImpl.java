package com.sparkdev.redis.dao;

import com.sparkdev.redis.entity.Order;
import com.sparkdev.redis.repository.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDaoImpl {

   /* private static final String KEY = "Order";
    private final RedisTemplate<String, Object> redisTemplate;

    public OrderDaoImpl(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public Order save(Order order){
        redisTemplate.opsForHash().put(KEY, order.getId(), order);
        return order;
    }

    public List<Object> findAll(){
        return redisTemplate.opsForHash().values(KEY);
    }

    public Object findOrderById(int orderId){
        return redisTemplate.opsForHash().get(KEY, orderId);
    }

    public List<Object> findOrdersByCustomerId(String customerId){
        return redisTemplate.opsForHash().values(customerId);
    }

    public Object deleteOrder(int orderId){
        return redisTemplate.opsForHash().delete(KEY, orderId);
    }*/

    private final OrdersRepo ordersRepo;

    public OrderDaoImpl(OrdersRepo ordersRepo) {
        this.ordersRepo = ordersRepo;
    }

    public Order save(Order order){
        return this.ordersRepo.save(order);
    }

    public List<Order> findAll(){
        return (List<Order>) this.ordersRepo.findAll();
    }
}
