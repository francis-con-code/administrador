package com.one.core.controller;

import com.one.core.model.dto.UserAdminDTO;
import com.one.core.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserAdminDTO userAdminDTO) {
        boolean isOk;

        isOk = userService.loginUser(userAdminDTO);
        if(isOk){
            return new ResponseEntity<>("login",HttpStatus.OK);
        }
        return new ResponseEntity<>("no login",HttpStatus.OK);
    }

    @PostMapping("/createAdmin")
    public ResponseEntity<?> createAdmin(@RequestBody UserAdminDTO userAdminDTO) {
        userService.createAdmin(userAdminDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
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
