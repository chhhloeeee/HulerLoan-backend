package com.example.loan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.loan.entity.UserEntity;
import com.example.loan.repository.UserRepository;

@Service
public class CustomUserService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub

        UserEntity userEntity = userRepository.findByUsername(username);

        if (null == userEntity) {
            throw new UsernameNotFoundException("User Not Found with username " + username);
        }
        return userEntity;
    }

}