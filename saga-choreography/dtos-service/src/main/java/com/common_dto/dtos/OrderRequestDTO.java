package com.common_dto.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class OrderRequestDTO {
    private Integer orderId;
    private Integer userId;
    private Integer productId;
    private Integer amount;
}

