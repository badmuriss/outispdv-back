package com.outis.br.pdv_back.dto.orderitem;

import java.math.BigDecimal;

public record OrderItemListResponse(
        String productName,
        Integer quantity,
        BigDecimal subtotal
) {
}
