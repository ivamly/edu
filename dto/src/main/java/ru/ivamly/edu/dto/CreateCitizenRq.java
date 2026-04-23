package ru.ivamly.edu.dto;

public record CreateCitizenRq(
        String firstName,
        String surname,
        String patronymic,
        String passportSeries,
        String passportNumber,
        String addressCountry,
        String addressCity,
        String addressStreet,
        String addressNumber
) {
}
