package com.paulo.test.presentation.controllers;

import com.paulo.test.application.repositories.user.IUserRepository;
import com.paulo.test.application.validators.dtos.CreateUserDto;
import com.paulo.test.domain.entities.User;
import com.paulo.test.main.factories.usecases.CreateUserCaseFactory;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class AddUserController {
    @Autowired
    private IUserRepository repository;

    @PostMapping()
    public void create(@Valid @RequestBody CreateUserDto userModel) {
        CreateUserCaseFactory.
                getInstance(repository).
                execute(new User(userModel));
    }
}
