package com.zavyalov.spring_boot.spring_boot_address_book.service;

import com.zavyalov.spring_boot.spring_boot_address_book.model.User;

public interface UserService {

    User getUser(int userId);

    void saveUser(User user);

    void deleteUser(int userUd);
}
