package com.example.loan.model;

public class User {
    private Integer userID;
    private String name;
    private String password;
    private Boolean admin;
    private String email;
    private String username;

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

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User(Integer userID, String name, String password, Boolean admin, String email, String username) {
        this.userID = userID;
        this.name = name;
        this.password = password;
        this.admin = admin;
        this.email = email;
        this.username = username;
    }

    public User() {
    }

}
