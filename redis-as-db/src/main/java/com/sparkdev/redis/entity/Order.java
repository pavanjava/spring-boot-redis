package com.sparkdev.redis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.Map;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Order")
public class Order implements Serializable {
    @Id
    private int id;
    private String customerId;
    private Map<String, Double> productPurchase;
    private double orderAmount;
    private double tax;
    private double totalAmount;

}
