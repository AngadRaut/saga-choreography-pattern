package com.common_dto.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class PaymentRequestDTO {
    private Integer orderId;
    private Integer userId;
    private Integer amount;
}
