package com.outis.br.pdv_back.dto.category;

import jakarta.validation.constraints.NotBlank;

public record CategoryCreateRequest(

        @NotBlank
        String name,

        String description

) {
}
