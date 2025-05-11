package com.orders.service;

import com.common_dto.dtos.OrderRequestDTO;
import com.common_dto.events.OrderEvent;
import com.common_dto.events.OrderStatus;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Sinks;

@Service
public class PublishOrderEvent {
    private Sinks.Many<OrderEvent> orderEventMany;

    public void publishOrderEvent(OrderRequestDTO orderRequestDTO, OrderStatus orderStatus){
        OrderEvent orderEvent = new OrderEvent(orderRequestDTO,orderStatus);
        orderEventMany.tryEmitNext(orderEvent);
    }
}
