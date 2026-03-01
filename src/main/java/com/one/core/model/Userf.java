package com.one.core.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//se pone la f por que H2 no deja crear entidades llamadas User
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Userf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private UserRol rol;
    private String password;
    private String email;
}
