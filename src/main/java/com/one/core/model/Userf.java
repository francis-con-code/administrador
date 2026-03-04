package com.one.core.model;

import jakarta.persistence.*;
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
    @ManyToOne
    @JoinColumn(name = "business_id")
    private Business business;
    private boolean enabled;

}
