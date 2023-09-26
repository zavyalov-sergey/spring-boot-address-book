package com.zavyalov.spring_boot.spring_boot_address_book.service;

import com.zavyalov.spring_boot.spring_boot_address_book.dao.ContactRepository;
import com.zavyalov.spring_boot.spring_boot_address_book.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    ContactRepository contactRepository;

    @Override
    public void saveContact(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public Contact getContact(int contactId) {
        return contactRepository.getReferenceById(contactId);
    }

    @Override
    public void deleteContact(int contactId) {
        contactRepository.deleteById(contactId);
    }
}
