package com.orders.configuration;

import com.common_dto.events.OrderEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Sinks;

@Configuration
public class OrderPublisherConfig {
    @Bean
    public Sinks.Many<OrderEvent> publishOrderEvents(){
        
    }
}
