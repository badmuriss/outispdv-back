package com.outis.br.pdv_back.dto.order;

import com.outis.br.pdv_back.model.enums.Status;

import java.time.LocalDateTime;

public record OrderListResponse(

        Long id,

        Status status,

        LocalDateTime createdAt
) {
}
