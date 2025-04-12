package com.outis.br.pdv_back.dto.ticket;

import com.outis.br.pdv_back.dto.ticketitem.TicketItemListResponse;
import com.outis.br.pdv_back.model.enums.TicketStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record TicketDetailResponse(

        Long id,

        String code,

        TicketStatus status,

        LocalDateTime createdAt,

        String barcode,

        Integer tableNumber,

        List<TicketItemListResponse> ticketItems,

        BigDecimal total

) {
}
