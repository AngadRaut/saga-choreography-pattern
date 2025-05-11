package com.common_dto.events;

import com.common_dto.dtos.OrderRequestDTO;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

public class OrderEvent implements Event{
    private Date eventDate = new Date();
    private UUID eventId = UUID.randomUUID();
    private OrderRequestDTO orderRequestDTO;
    private OrderStatus orderStatus;

    @Override
    public Date getDate() {
        return eventDate;
    }

    @Override
    public UUID getEventId() {
        return eventId;
    }

    public OrderEvent(OrderRequestDTO orderRequestDTO, OrderStatus orderStatus) {
        this.orderRequestDTO = orderRequestDTO;
        this.orderStatus = orderStatus;
    }

    public OrderEvent() {
    }
}