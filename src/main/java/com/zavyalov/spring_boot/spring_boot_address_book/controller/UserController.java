package com.zavyalov.spring_boot.spring_boot_address_book.controller;

import com.zavyalov.spring_boot.spring_boot_address_book.model.User;
import com.zavyalov.spring_boot.spring_boot_address_book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/users")
    public User addNewUser(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }

    @GetMapping("users/{userId}")
    public User getUser(@PathVariable int userId) {
        User user = userService.getUser(userId);
        return user;
    }

    @PutMapping("/users")
    public User updateEmployee(@RequestBody User user) {
        userService.saveUser(user);

        return user;
    }

    @DeleteMapping("users/{userId}")
    public String deleteEmployee(@PathVariable int userId) {
        User user = userService.getUser(userId);

        userService.deleteUser(userId);
        return "User was deleted. ID: " + userId;
    }
}
