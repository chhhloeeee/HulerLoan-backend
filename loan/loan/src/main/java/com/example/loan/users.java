package com.example.loan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class users {
    private Integer userID;
    private String name;
    private String password;
    private String admin;
    private String email;
    private String address;

    public users() {
    }

    public users(Integer userID, String name, String password, String admin, String email, String address) {
        this.userID = userID;
        this.name = name;
        this.password = password;
        this.admin = admin;
        this.email = email;
        this.address = address;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
