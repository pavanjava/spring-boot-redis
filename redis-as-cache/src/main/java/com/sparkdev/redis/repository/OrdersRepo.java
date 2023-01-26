package com.sparkdev.redis.repository;

import com.sparkdev.redis.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepo extends CrudRepository<Order, Integer> {
}
