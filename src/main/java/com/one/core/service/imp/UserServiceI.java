package com.one.core.service.imp;

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
    public void createAdmin() {

    }

    @Override
    public void createUser() {

    }

    @Override
    public void deletedAdmin() {

    }

    @Override
    public void deletedUser() {

    }

    @Override
    public void updateUser() {

    }

    @Override
    public void updateAdmin() {

    }
}
