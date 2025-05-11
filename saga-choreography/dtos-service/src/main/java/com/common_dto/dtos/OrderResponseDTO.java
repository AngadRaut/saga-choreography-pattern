package com.common_dto.dtos;

import com.common_dto.events.OrderStatus;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class OrderResponseDTO {
    private Integer orderId;
    private Integer userId;
    private Integer productId;
    private Integer amount;
    private OrderStatus orderStatus;
}
