package com.one.core.model.dto;


import lombok.Data;

@Data
public class UserAdminDTO {
    private String name;
    private String password;
    private String email;
    private Long tandenId;
}
