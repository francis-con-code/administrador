package com.one.core.model.dto;

import com.one.core.model.UserRol;
import lombok.Data;

@Data
public class UserResponseDTO {
    private Long id;
    private String name;
    private String email;
    private UserRol rol;
    private boolean enabled;
}
