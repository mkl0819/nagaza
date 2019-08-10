package com.nagaza.service;

import java.util.List;

import com.nagaza.document.User;

import org.springframework.stereotype.Service;

/**
 * UserService
 */
@Service
public interface UserService {
    List<User> findAll();

    User findByName(String name);

    void delete(User user);

    <S extends User> S insert(User user);
    
}