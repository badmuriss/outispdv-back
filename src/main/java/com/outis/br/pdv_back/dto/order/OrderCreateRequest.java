package com.outis.br.pdv_back.dto.order;

import com.outis.br.pdv_back.dto.orderitem.OrderItemCreateRequest;
import jakarta.validation.Valid;

import java.util.List;

public record OrderCreateRequest(

        @Valid
        List<OrderItemCreateRequest> orderItems

) {
}
