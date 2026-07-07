package com.microservices.gateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public String gatewayBean() {

        System.out.println("API Gateway Configured");

        return "Gateway";

    }

}