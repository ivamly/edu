package ru.ivamly.edu.dto;

import java.util.UUID;

public record PassportDto(
        UUID id,
        String series,
        String number,
        AddressDto address
) {
}
