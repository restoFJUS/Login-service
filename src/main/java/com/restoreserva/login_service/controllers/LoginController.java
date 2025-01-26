package com.restoreserva.login_service.controllers;

import com.restoreserva.login_service.entity.User;
import com.restoreserva.login_service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/login-user")
    public ResponseEntity<User> loginUser(@RequestBody User user) {
       User user1 = userService.loginUser(user.getUsername(), user.getPassword());
       return new ResponseEntity<>(user1, HttpStatus.CREATED);
    }
}
