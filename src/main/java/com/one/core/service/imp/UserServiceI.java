package com.one.core.service.imp;

import com.one.core.model.dto.UserAdminDTO;
import com.one.core.repository.UserRepository;
import com.one.core.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceI implements UserService {

    private final UserRepository userRepository;

    public UserServiceI(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createAdmin(UserAdminDTO userAdminDTO) {

    }

    @Override
    public void createUser() {

    }

    @Override
    public void deletedAdmin(Long id) {

    }

    @Override
    public void deletedUser() {

    }

    @Override
    public void updateUser() {

    }

    @Override
    public void updateAdmin(UserAdminDTO userAdminDTO) {

    }
}
