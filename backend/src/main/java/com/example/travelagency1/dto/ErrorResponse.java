package com.example.travelagency1.dto;

import java.time.LocalDateTime;

public record ErrorResponse(
        LocalDateTime timestamp,
        int statues,
        String errorMessage,
        String path
) {
}
