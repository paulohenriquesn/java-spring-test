package com.paulo.test.application.validators.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

public class CreateUserDto {
    @NotEmpty()
    @Min(3)
    public String name;
}
