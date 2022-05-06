package com.example.loan.service;

import com.example.loan.entity.UserEntity;
import com.example.loan.model.User;
import com.example.loan.repository.UserRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);
        userRepository.save(userEntity);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        List<UserEntity> userEntities = userRepository.findAll();

        List<User> users = userEntities
                .stream()
                .map(userEntity -> new User(
                        userEntity.getUserID(),
                        userEntity.getName(),
                        userEntity.getPassword(),
                        userEntity.getUserRole(),
                        userEntity.getEmail(),
                        userEntity.getUsername()))
                .collect(Collectors.toList());

        return users;
    }

    @Override
    public User getUserById(Integer userID) {
        UserEntity userEntity = userRepository.findById(userID).get();
        User user = new User();
        BeanUtils.copyProperties(userEntity, user);
        return user;
    }

    @Override
    public boolean deletedUser(Integer userID) {
        UserEntity user = userRepository.findById(userID).get();
        userRepository.delete(user);
        return true;
    }

    @Override
    public User updateUser(Integer userID, User user) {
        UserEntity userEntity = userRepository.findById(userID).get();
        userEntity.setEmail(user.getEmail());
        userEntity.setName(user.getName());
        userEntity.setPassword(user.getPassword());

        userRepository.save(userEntity);
        return user;
    }

}
