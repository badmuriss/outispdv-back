package com.outis.br.pdv_back.dto.ticket;

import com.outis.br.pdv_back.model.enums.OrderStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TicketListResponse(

        Long id,

        String code,

        OrderStatus status,

        LocalDateTime createdAt,

        BigDecimal total

) {
}
