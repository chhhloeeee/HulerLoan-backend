package com.example.loan.controller;

import com.example.loan.model.User;
import com.example.loan.service.UserService;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{userID}")
    public ResponseEntity<User> getUserById(@PathVariable("userID") Integer userID) {
        User user = null;
        user = userService.getUserById(userID);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/users/{userID}")
    public ResponseEntity<Map<String, Boolean>> deleteUser(@PathVariable("userID") Integer userID) {
        boolean deleted = false;
        deleted = userService.deletedUser(userID);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/users/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable("username") String username)
            throws UsernameNotFoundException {
        User user = null;
        user = userService.getUserByUsername(username);
        return ResponseEntity.ok(user);
    }
}
