package com.orders.controller;

import com.common_dto.dtos.OrderRequestDTO;
import com.orders.entity.PurchaseOrder;
import com.orders.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public PurchaseOrder createOrder(@RequestBody OrderRequestDTO orderRequestDTO){
        return this.orderService.createOrder(orderRequestDTO);
    }

    @GetMapping("/get-all")
    public List<PurchaseOrder> getAllOrders(){
        return this.orderService.getAllOrders();
    }

}