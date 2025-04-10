package com.outis.br.pdv_back.dto.orderitem;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public record OrderItemCreateRequest(

        @NotNull
        @PositiveOrZero
        Long productId,

        @NotNull
        @Positive
        Integer quantity
) {
}
