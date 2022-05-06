package com.example.loan.requests;

public class AuthenticationRequest {

    private String username;
    private String password;
    private Boolean admin;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getAdmin() {
        return admin;
    }
}
