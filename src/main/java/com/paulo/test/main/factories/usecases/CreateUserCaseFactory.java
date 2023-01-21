package com.paulo.test.main.factories.usecases;

import com.paulo.test.application.repositories.user.IUserRepository;
import com.paulo.test.application.usecases.CreateUserCase;

public class CreateUserCaseFactory {
    static CreateUserCase instance;

   public static CreateUserCase getInstance(IUserRepository userRepository) {
       if(instance == null) {
           instance = new CreateUserCase(
                   userRepository
           );
       }
       return instance;
   }
}

