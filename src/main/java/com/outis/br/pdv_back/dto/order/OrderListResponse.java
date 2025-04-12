package com.outis.br.pdv_back.dto.order;

import com.outis.br.pdv_back.model.enums.OrderStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record OrderListResponse(

        Long id,

        OrderStatus status,

        LocalDateTime createdAt,

        BigDecimal total

) {
}
