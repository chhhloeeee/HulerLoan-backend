package com.example.loan;

import javax.persistence.Entity;

//import javax.persistence.Entity; //Claims to be unused
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class users {
    private Integer userID;
    private String name;
    private String password;
    private Boolean isAdmin;
    private String email;
    private String address;

    public users(){
    }
/* 
    public users(Integer userID, String name, String password, Boolean isAdmin, String email, String address){
        this.userID = userID;
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
        this.email = email;
        this.address = address;
    } */ //Unsure if this is needed 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return userID;
    }

    public void setId(Integer userID) {
        this.userID = userID;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public Boolean getIsAdin(){
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin){
        this.isAdmin = isAdmin;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }
}

 
