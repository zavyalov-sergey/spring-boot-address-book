package com.zavyalov.spring_boot.spring_boot_address_book.service;

import com.zavyalov.spring_boot.spring_boot_address_book.dao.UserRepository;
import com.zavyalov.spring_boot.spring_boot_address_book.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void addNewUser(User user) {
        userRepository.save(user);
    }
}
