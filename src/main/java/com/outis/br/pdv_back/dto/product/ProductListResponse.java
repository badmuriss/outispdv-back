package com.outis.br.pdv_back.dto.product;

import java.math.BigDecimal;

public record ProductListResponse(

        Long id,

        String name,

        BigDecimal price,

        String categoryName
) {
}
