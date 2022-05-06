package com.example.loan.service;

import java.util.List;

import com.example.loan.model.User;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Integer userID);

    User updateUser(Integer userID, User user);

    boolean deletedUser(Integer userID);

    User getUserByUsername(String username);
}
