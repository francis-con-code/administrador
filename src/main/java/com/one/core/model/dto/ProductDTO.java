package com.one.core.model.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
public class ProductDTO {
    private String name;
    private String description;
    private BigDecimal price;
    private boolean active;
    private LocalDateTime createdAt;
}
