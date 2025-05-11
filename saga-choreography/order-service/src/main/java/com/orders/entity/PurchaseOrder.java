package com.orders.entity;

import com.common_dto.events.OrderStatus;
import com.common_dto.events.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PURCHASE_ORDER_TBL")
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long purchaseId;
    private Integer userId;
    private Integer productId;
    private Integer price;
    private OrderStatus orderStatus;
    private PaymentStatus paymentStatus;

    public PurchaseOrder(Long purchaseId, Integer userId, Integer productId, Integer price, OrderStatus orderStatus, PaymentStatus paymentStatus) {
        this.purchaseId = purchaseId;
        this.userId = userId;
        this.productId = productId;
        this.price = price;
        this.orderStatus = orderStatus;
        this.paymentStatus = paymentStatus;
    }

    public PurchaseOrder() {
    }

    public Long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "purchaseId=" + purchaseId +
                ", userId=" + userId +
                ", productId=" + productId +
                ", price=" + price +
                ", orderStatus=" + orderStatus +
                ", paymentStatus=" + paymentStatus +
                '}';
    }
}