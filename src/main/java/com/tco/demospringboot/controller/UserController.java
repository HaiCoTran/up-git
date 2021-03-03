package com.tco.demospringboot.controller;

import com.tco.demospringboot.entity.User;
import com.tco.demospringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public ResponseEntity<?> getListUser(){
        List<User> users = userService.getListUser();
        return ResponseEntity.ok(users);
    }
}
