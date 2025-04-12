package com.outis.br.pdv_back.dto.ticketitem;

import java.math.BigDecimal;

public record TicketItemListResponse(
        String productName,
        Integer quantity,
        BigDecimal subtotal
) {
}
