package ru.ivamly.edu.dto;

public record AddressDto(
        String country,
        String city,
        String street,
        String number
) {
}
