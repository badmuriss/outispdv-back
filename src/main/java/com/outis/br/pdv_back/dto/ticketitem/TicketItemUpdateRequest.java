package com.outis.br.pdv_back.dto.ticketitem;

import jakarta.validation.constraints.Positive;

public record TicketItemUpdateRequest(
        @Positive
        Integer quantity
) {
}
