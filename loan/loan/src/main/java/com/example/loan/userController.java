package com.example.loan;

import java.util.*;
 
import org.springframework.beans.factory.annotation.*;
//import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

@RestController
public class userController {

    @Autowired
    private userService service;

    @GetMapping("/users")
    public List<users> list() {
        return service.listAll();
    }
    
}
