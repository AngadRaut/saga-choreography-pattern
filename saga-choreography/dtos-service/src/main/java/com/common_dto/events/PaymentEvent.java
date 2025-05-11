package com.common_dto.events;

import com.common_dto.dtos.PaymentRequestDTO;

import java.util.Date;
import java.util.UUID;

public class PaymentEvent implements Event{
    private Date eventDate = new Date();
    private UUID eventId = UUID.randomUUID();
    private PaymentRequestDTO paymentRequestDTO;
    private PaymentStatus paymentStatus;

    @Override
    public Date getDate() {
        return eventDate;
    }

    @Override
    public UUID getEventId() {
        return eventId;
    }

    public PaymentEvent(PaymentRequestDTO paymentRequestDTO, PaymentStatus paymentStatus) {
        this.paymentRequestDTO = paymentRequestDTO;
        this.paymentStatus = paymentStatus;
    }

    public PaymentEvent() {
    }
}
