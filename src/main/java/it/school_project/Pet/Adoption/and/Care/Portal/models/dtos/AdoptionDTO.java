package it.school_project.Pet.Adoption.and.Care.Portal.models.dtos;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AdoptionDTO {

    @NotNull(message = "The id is required")
    private Long id;

    @NotNull(message = "The owner is required")
    private ResponseOwnerDTO owner;

    @NotNull(message = "The pet is required")
    private ResponsePetDTO pet;

    @NotNull(message = "The adoption date is required")
    @FutureOrPresent(message = "The adoption date cannot be in the past")
    private LocalDate adoptionDate;

    private String status;
}

