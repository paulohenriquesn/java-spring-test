package com.paulo.test.application.repositories.user;

import com.paulo.test.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
