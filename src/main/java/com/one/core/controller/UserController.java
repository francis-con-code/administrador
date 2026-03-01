package com.one.core.controller;

import com.one.core.model.dto.UserAdminDTO;
import com.one.core.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/logn")
    public ResponseEntity<?> login(@RequestBody String string) {
        return null;
    }

    @PostMapping("/createAdmin")
    public ResponseEntity<?> createAdmin(@RequestBody UserAdminDTO userAdminDTO) {
        return null;
    }

    @PutMapping("/updateAdmin")
    public ResponseEntity<?> updateAdmin(@RequestBody UserAdminDTO value) {
        return null;
    }
    @DeleteMapping("/deletedAdmin")
    public ResponseEntity<?> deletedAdmin(@RequestBody Long id){
        return null;
    }

}
