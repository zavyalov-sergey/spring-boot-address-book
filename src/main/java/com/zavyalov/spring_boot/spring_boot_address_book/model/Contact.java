package com.zavyalov.spring_boot.spring_boot_address_book.model;

import jakarta.persistence.*;

@Entity
@Table
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private int contactId;

    @Column(name = "contact_surname")
    private String contactSurname;

    @Column(name = "contact_name")
    private String contactName;

    @Column(name = "contact_phone")
    private String contactPhone;

    @Column(name = "contact_email")
    private String contactEmail;

    @Column(name = "contct_definition")
    private String contactDefinition;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    public Contact() {
    }

    public Contact(String contactSurname, String contactName, String contactPhone, String contactEmail, String contactDefinition) {
        this.contactSurname = contactSurname;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
        this.contactEmail = contactEmail;
        this.contactDefinition = contactDefinition;
    }

    public int getContactId() {
        return contactId;
    }



    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getContactSurname() {
        return contactSurname;
    }

    public void setContactSurname(String contactSurname) {
        this.contactSurname = contactSurname;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactDefinition() {
        return contactDefinition;
    }

    public void setContactDefinition(String contactDefinition) {
        this.contactDefinition = contactDefinition;
    }
}
