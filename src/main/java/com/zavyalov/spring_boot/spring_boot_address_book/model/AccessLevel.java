package com.zavyalov.spring_boot.spring_boot_address_book.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "access_level")
public class AccessLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "access_level_id")
    private int accessLevelId;      //or id

    @Column(name = "access_level_name")
    private String accessLevelName;

    @OneToMany(cascade = CascadeType.ALL)
    private List<User> users;

    public AccessLevel() {
    }

    public AccessLevel(String accessLevelName) {
        this.accessLevelName = accessLevelName;
    }

    public void addUserToAccessLevel(User user) {  //maybe this belongs to User
        if (users != null)
            users = new ArrayList<>();
        users.add(user);
        user.setAccessLevel(this);
    }

    public int getAccessLevelId() {
        return accessLevelId;
    }

    public void setAccessLevelId(int accessLevelId) {
        this.accessLevelId = accessLevelId;
    }

    public String getAccessLevelName() {
        return accessLevelName;
    }

    public void setAccessLevelName(String accessLevelName) {
        this.accessLevelName = accessLevelName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "AccessLevel{" +
                "accessLevelId=" + accessLevelId +
                ", accessLevelName='" + accessLevelName + '\'' +
                ", users=" + users +
                '}';
    }
}
