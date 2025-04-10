package com.outis.br.pdv_back.dto.product;

import java.math.BigDecimal;

public record ProductUpdateRequest(

        String name,

        BigDecimal price,

        String description,

        String photo,

        String categoryName

) {
}
