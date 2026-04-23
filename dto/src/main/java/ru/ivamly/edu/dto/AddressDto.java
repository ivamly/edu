package ru.ivamly.edu.dto;

import java.util.UUID;

public record AddressDto(
        UUID id,
        String country,
        String city,
        String street,
        String number
) {
}
