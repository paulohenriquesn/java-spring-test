package com.paulo.test.application.usecases;

import com.paulo.test.application.repositories.user.IUserRepository;
import com.paulo.test.domain.entities.User;

public class CreateUserCase {
    IUserRepository userRepository;
    public CreateUserCase(IUserRepository userRepository){
        this.userRepository = userRepository;
    }
    public void execute(User entity) {
        this.userRepository.save(entity);
    }
}
