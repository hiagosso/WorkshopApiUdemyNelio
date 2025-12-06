package com.hiagodev.course.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiagodev.course.entities.User;


@RestController
@RequestMapping(value ="/users")
public class UserController {
    
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u1 = new User("hiago", "souza8hiago@email.com", "1192929292", "coisa");
        
        return ResponseEntity.ok().body(u1);
    }
}
