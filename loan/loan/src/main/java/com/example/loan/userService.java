package com.example.loan;

import java.util.List;
 
import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class userService {

    @Autowired
    private userRepository repo;

    public List<users> listAll() {
        return repo.findAll();
    }

    public void save(users users){
        repo.save(users);
    }

    public users get(Integer userID){
        return repo.findById(userID).get();
    }

    public void delete(Integer userID){
        repo.deleteById(userID);
    }
    
}
