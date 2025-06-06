package com.outis.br.pdv_back.dto.ticketitem;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public record TicketItemCreateRequest(
        @NotNull
        @PositiveOrZero
        Long productId,

        @NotNull
        @Positive
        Integer quantity
) {
}
