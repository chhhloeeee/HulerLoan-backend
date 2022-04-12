package com.example.loan;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

    @Autowired
    private userService service;

    @GetMapping("/users")
    public List<users> list() {
        return service.listAll();
    }

    @GetMapping("/users/{userID}")
    public ResponseEntity<users> get(@PathVariable Integer userID){
        try {
            users users = service.get(userID);
            return new ResponseEntity<users>(users, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<users>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/users")
    public void add(@RequestBody users users){
        service.save(users);
    }   
    
    @PutMapping("users/{userID}")
    public ResponseEntity<?> update(@RequestBody users users, @PathVariable Integer userID){
        try {
            users existusers = service.get(userID);
            service.save(users);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/users/{userID}")
    public void delete(@PathVariable Integer userID) {
        service.delete(userID);
    }
}
