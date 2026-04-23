package ru.ivamly.edu.dto;

public record PassportDto(
        String series,
        String number,
        AddressDto address
) {
}
