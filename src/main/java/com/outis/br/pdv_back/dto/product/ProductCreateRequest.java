package com.outis.br.pdv_back.dto.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record ProductCreateRequest(

        @NotBlank
        String name,

        @NotNull
        @Positive
        BigDecimal price,

        String description,

        String photo,

        String categoryName
) {
}
