package com.prowings.orderApi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "inventoryClient", url = "${spring.cloud.openfeign.url}")
public interface InventoryClient {

    @GetMapping("/inventory/check")
    public String checkInventory();
}