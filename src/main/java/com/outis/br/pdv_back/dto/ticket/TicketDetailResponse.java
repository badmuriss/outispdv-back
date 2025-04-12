package com.outis.br.pdv_back.dto.order;

import com.outis.br.pdv_back.dto.orderitem.OrderItemListResponse;
import com.outis.br.pdv_back.model.enums.OrderStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record OrderDetailResponse(

        Long id,

        OrderStatus status,

        LocalDateTime createdAt,

        List<OrderItemListResponse> orderItems,

        BigDecimal total

) {
}
