package com.one.core.model.dto;

import com.one.core.model.Product;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class StockDTO {
    private String name;
    private Long productId;
    private BigDecimal quantity;
    private BigDecimal minimumStock;
    private String unit;
    private LocalDateTime lastUpdated;
    private LocalDateTime expirationDate;
    private String location;
}
