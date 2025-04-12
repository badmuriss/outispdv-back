package com.outis.br.pdv_back.dto.product;

import java.math.BigDecimal;

public record ProductDetailResponse(

        Long id,

        String name,

        BigDecimal price,

        String categoryName,

        String description,

        String photo,

        String barcode

) {
}
