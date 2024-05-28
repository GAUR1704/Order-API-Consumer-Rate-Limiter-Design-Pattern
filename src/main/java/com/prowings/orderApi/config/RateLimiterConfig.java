package com.prowings.orderApi.config;

import org.springframework.context.annotation.Bean;

import io.github.resilience4j.ratelimiter.RateLimiterRegistry;

public class RateLimiterConfig {
	
	 @Bean
	    public RateLimiterRegistry rateLimiterRegistry() {
	        return RateLimiterRegistry.ofDefaults();
	    }

}
