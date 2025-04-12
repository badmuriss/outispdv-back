package com.outis.br.pdv_back.dto.ticket;

import com.outis.br.pdv_back.dto.ticketitem.TicketItemCreateRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

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
