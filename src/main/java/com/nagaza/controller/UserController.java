package com.nagaza.controller;

import java.util.List;

import com.nagaza.document.User;
import com.nagaza.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping(value="/getUserByName/{name}")
    public User getUserByName(@PathVariable("name") String name){
        return userService.findByName(name);
    }
    // @GetMapping(value="/getUserByName/{name}")
    // public getUserByName(@PathVariable("name") String name){
    //     return userService.findByName(name);
    // }

    @GetMapping(value="/getUsers")
    public List<User> getUsers(){
        return userService.findAll();
    }
}