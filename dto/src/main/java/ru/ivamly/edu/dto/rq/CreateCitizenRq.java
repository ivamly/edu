package ru.ivamly.edu.dto.rq;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record CreateCitizenRq(

        @NotBlank
        @Size(max = 100)
        String firstName,

        @NotBlank
        @Size(max = 100)
        String surname,

        @Size(max = 100)
        String patronymic,

        @NotBlank
        @Pattern(regexp = "^\\d{4}$")
        String passportSeries,

        @NotBlank
        @Pattern(regexp = "^\\d{6}$")
        String passportNumber,

        @NotBlank
        @Size(max = 200)
        String addressCountry,

        @NotBlank
        @Size(max = 200)
        String addressCity,

        @NotBlank
        @Size(max = 200)
        String addressStreet,

        @NotBlank
        @Size(max = 200)
        String addressNumber
) {
}
