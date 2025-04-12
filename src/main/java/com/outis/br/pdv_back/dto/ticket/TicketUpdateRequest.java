package com.outis.br.pdv_back.dto.ticket;

import com.outis.br.pdv_back.dto.orderitem.OrderItemCreateRequest;
import jakarta.persistence.Column;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public record TicketCreateRequest(

        @NotBlank
        String code,

        String barcode,

        Integer tableNumber,

        @Valid
        List<TicketItemCreateRequest> ticketItems
) {
}
