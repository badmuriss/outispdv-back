package com.outis.br.pdv_back.dto.ticket;

import com.outis.br.pdv_back.dto.ticketitem.TicketItemCreateRequest;
import jakarta.validation.Valid;

import java.util.List;

public record TicketUpdateRequest(

        Integer tableNumber,

        @Valid
        List<TicketItemCreateRequest> ticketItems

) {
}
