package com.zavyalov.spring_boot.spring_boot_address_book.controller;

import com.zavyalov.spring_boot.spring_boot_address_book.model.User;
import com.zavyalov.spring_boot.spring_boot_address_book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/users")
    public User addNewUser(@RequestBody User user) {
        userService.addNewUser(user);
        return user;
    }
}
