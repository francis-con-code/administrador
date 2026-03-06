package com.one.core.controller;

import com.one.core.model.UserRol;
import com.one.core.model.Userf;
import com.one.core.model.dto.CreateAdminRequestDTO;
import com.one.core.model.dto.UserResponseDTO;
import com.one.core.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    public AdminController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/users/admin")
    public UserResponseDTO createAdmin(@RequestBody CreateAdminRequestDTO createAdminRequestDTO) {
        if(userRepository.existsByEmail(createAdminRequestDTO.getEmail())){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Email already exists");
        }
        Userf user = new Userf();
        user.setName(createAdminRequestDTO.getName());
        user.setPassword(passwordEncoder.encode(createAdminRequestDTO.getPassword()));
        user.setEmail(createAdminRequestDTO.getEmail());
        user.setRol(UserRol.ADMIN);
        user.setEnabled(true);

        Userf saved = userRepository.save(user);

        return new UserResponseDTO(saved.getId(),saved.getName(),saved.getEmail(),saved.getRol(),saved.isEnabled());
    }

}
