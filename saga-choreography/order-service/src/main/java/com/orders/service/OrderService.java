package com.orders.service;

import com.common_dto.dtos.OrderRequestDTO;
import com.common_dto.events.OrderStatus;
import com.orders.entity.PurchaseOrder;
import com.orders.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private PublishOrderEvent orderEvent;

    @Transactional
    public PurchaseOrder createOrder(OrderRequestDTO orderRequestDTO){
        PurchaseOrder order = this.orderRepo.save(convertOrderDTOToEntity(orderRequestDTO));
        orderRequestDTO.setOrderId(order.getProductId());
        // produce kafka event with status ORDER_CREATED
        orderEvent.publishOrderEvent(orderRequestDTO,OrderStatus.ORDER_CREATED);
        return order ;
    }

    public List<PurchaseOrder> getAllOrders(){
        return this.orderRepo.findAll();
    }

    private PurchaseOrder convertOrderDTOToEntity(OrderRequestDTO orderRequestDTO){
        PurchaseOrder order = new PurchaseOrder();
        order.setOrderStatus(OrderStatus.ORDER_CREATED);
        order.setPrice(orderRequestDTO.getAmount());
        order.setUserId(orderRequestDTO.getUserId());
        order.setUserId(orderRequestDTO.getProductId());
        return order;
    }
}