package com.one.core.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Boolean active;
    private LocalDateTime createAt;
    @OneToMany
    private List<Userf> users;
    @OneToMany
    private List<Stock> stocks;
    @OneToMany
    private List<StockMovement> stockMovements;
    @OneToMany
    private List<Product> products;
}
