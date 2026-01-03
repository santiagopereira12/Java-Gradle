package com.platzi.play.domain.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public record UpdateMovieDto(
        @NotBlank(message = "El titulo es Obligatorio.")
        String tittle,

        @PastOrPresent(message = "La fecha de lanzamiento debe estar entre la fecha actual y la anterior.")
        LocalDate releaseDate,

        @Min(value = 0, message = "El rating no puede ser menor a 0.")
        @Max(value = 5, message = "El rating no puede ser mayor a 5.")
        Double rating
) {
}
