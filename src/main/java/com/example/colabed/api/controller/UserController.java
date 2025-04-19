package com.example.colabed.api.controller;

import com.example.colabed.service.UserService;
import com.example.colabed.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // Allow requests from React
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public User loginUser(@RequestBody User user) {
        return userService.saveOrUpdate(user);
    }
}
