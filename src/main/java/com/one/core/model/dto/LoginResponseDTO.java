package com.one.core.model.dto;

import lombok.Data;

@Data
public class LoginResponseDTO {
    private String token;
    private String tokenType;
}
