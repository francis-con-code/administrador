package com.one.core.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Product product;
    private BigDecimal quantity;
    private BigDecimal minimumStock;
    private String unit;
    private LocalDateTime lastUpdated;
    private LocalDateTime expirationDate;
    private String location;


}
