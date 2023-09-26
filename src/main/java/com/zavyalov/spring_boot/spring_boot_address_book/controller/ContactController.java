package com.zavyalov.spring_boot.spring_boot_address_book.controller;

import com.zavyalov.spring_boot.spring_boot_address_book.model.Contact;
import com.zavyalov.spring_boot.spring_boot_address_book.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {

    @Autowired
    ContactService contactService;

    @PostMapping("/contacts")
    public Contact addNewUser(@RequestBody Contact contact) {
        contactService.saveContact(contact);
        return contact;
    }

    @GetMapping("/contacts/{contactId}")
    public Contact getContact(@PathVariable int contactId) {
        Contact contact = contactService.getContact(contactId);
        return contact;
    }

    @PutMapping("/contacts")
    public Contact updateContact(@RequestBody Contact contact) {
        contactService.saveContact(contact);

        return contact;
    }

    @DeleteMapping("/contacts/{contactId}")
    public String deleteEmployee(@PathVariable int contactId) {
        Contact contact = contactService.getContact(contactId);

        contactService.deleteContact(contactId);
        return "Contact was deleted. ID: " + contactId;
    }
}
