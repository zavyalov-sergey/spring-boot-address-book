package com.zavyalov.spring_boot.spring_boot_address_book.dao;

import com.zavyalov.spring_boot.spring_boot_address_book.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
