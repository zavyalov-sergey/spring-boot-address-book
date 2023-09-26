package com.zavyalov.spring_boot.spring_boot_address_book.service;

import com.zavyalov.spring_boot.spring_boot_address_book.model.Contact;

public interface ContactService {
    void saveContact(Contact contact);

    Contact getContact(int contactId);

    void deleteContact(int contactId);
}
