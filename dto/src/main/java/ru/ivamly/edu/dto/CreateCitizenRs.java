package ru.ivamly.edu.dto;

public record CreateCitizenRs(
        String firstName,
        String surname,
        String patronymic,
        PassportDto passport
) {
}
