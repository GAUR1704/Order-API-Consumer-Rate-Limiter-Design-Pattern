package com.prowings.orderApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrderApiConsumerRateLimiterDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApiConsumerRateLimiterDesignPatternApplication.class, args);
	}

}
