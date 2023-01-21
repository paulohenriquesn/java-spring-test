package com.paulo.test.domain.entities;

import com.paulo.test.application.validators.dtos.CreateUserDto;
import jakarta.persistence.*;

@Entity()
@Table(name = "users")
public class User {
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public User() {

    }

    public void setName(String name) {this.name = name;}
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public User(CreateUserDto dto) {
        this.name = dto.name;
    }
}
