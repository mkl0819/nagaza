package com.nagaza.repository;

import com.nagaza.document.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * UserRepository
 */
@Repository
public interface UserRepository extends MongoRepository<User, String>{

    // List<User> findAll();

    User findByName(String name);

    // void delete(User user);

    <S extends User> S insert(User user);
    
}