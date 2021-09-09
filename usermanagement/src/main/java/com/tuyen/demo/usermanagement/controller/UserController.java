package com.tuyen.demo.usermanagement.controller;

import com.tuyen.demo.usermanagement.domain.User;
import com.tuyen.demo.usermanagement.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void create(@RequestBody User user) {
        userService.add(user);
    }

    @GetMapping
    public List<User> find() {
        return userService.find();
    }
}
