package com.nagaza.service;

import java.util.List;

import com.nagaza.document.User;
import com.nagaza.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepo;

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User findByName(String name) {
        return userRepo.findByName(name);
    }

    @Override
    public <S extends User> S insert(User user) {
        return userRepo.insert(user);
    }

    @Override
    public void delete(User user) {
        userRepo.delete(user);
    }
}