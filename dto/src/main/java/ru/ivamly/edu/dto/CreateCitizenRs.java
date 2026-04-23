package ru.ivamly.edu.dto;

import java.util.UUID;

public record CreateCitizenRs(
        UUID id,
        String firstName,
        String surname,
        String patronymic,
        PassportDto passport
) {
}
