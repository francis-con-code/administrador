package com.one.core.service;

import com.one.core.model.dto.UserAdminDTO;

public interface UserService {
    void createAdmin(UserAdminDTO userAdminDTO);
    void createUser();
    void deletedAdmin(Long id);
    void deletedUser();
    void updateUser();
    void updateAdmin(UserAdminDTO userAdminDTO);
}
