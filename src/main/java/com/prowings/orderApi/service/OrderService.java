package com.prowings.orderApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

@Service
public class OrderService {

    private final InventoryClient inventoryClient;

    @Autowired
    public OrderService(InventoryClient inventoryClient) {
        this.inventoryClient = inventoryClient;
    }

    @RateLimiter(name = "orderServiceRateLimiter", fallbackMethod = "fallbackMethod")
    
    public ResponseEntity<String> placeOrder() {
    	
        String response = inventoryClient.checkInventory();
        
        return ResponseEntity.ok(response);
    }

    public ResponseEntity<String> fallbackMethod(Throwable t) {
    	
        return ResponseEntity.status(429).body("Rate limiter is active. Please try again later.");
    }
}