package com.example.loan;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

    @Autowired
    private userService service;

    @GetMapping("/users")
    public List<users> list() {
        return service.listAll();
    }
    
}
