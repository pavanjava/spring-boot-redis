package com.sparkdev.redis.controller;

import com.sparkdev.redis.entity.Order;
import com.sparkdev.redis.dao.OrderDaoImpl;
import com.sparkdev.redis.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/order")
    public Order saveOrder(@RequestBody  Order order){
        return  this.orderService.save(order);
    }

    @GetMapping("/order")
    public List<Order> findAllOrders(){
        return this.orderService.findAll();
    }
}
