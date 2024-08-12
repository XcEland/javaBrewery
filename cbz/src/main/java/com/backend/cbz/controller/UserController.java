package com.backend.cbz.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.cbz.model.User;

@RestController
public class UserController {

    static Map<String, User> userRepo = new HashMap<>();

    static{
        User user1 = new User();
        user1.setId("123");
        user1.setName("Dawns");
        user1.setEmail("dawns@gmail.com");
        userRepo.put(user1.getId(), user1);

        User user2 = new User();
        user2.setId("112");
        user2.setName("Drew");
        user2.setEmail("drew@gmail.com");
        userRepo.put(user2.getId(), user2);

        User user3 = new User();
        user3.setId("13");
        user3.setName("Mc");
        user3.setEmail("mc@gmail.com");
        userRepo.put(user3.getId(), user3);
    }
    
    @RequestMapping(value = "/users")
    public ResponseEntity<Object> getUser(){
        return new ResponseEntity<>(userRepo.values(), HttpStatus.OK);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public ResponseEntity<Object> createUser(@RequestBody User user){
        userRepo.put(user.getId(), user);
        return new ResponseEntity<>("User is created successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateUser(@PathVariable("id") String id, @RequestBody User user){
        userRepo.remove(id);
        user.setId(id);
        userRepo.put(id, user);
        return new ResponseEntity<>("User is updated successfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/Users/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        userRepo.remove(id);
        return new ResponseEntity<>("User is deleted successfully", HttpStatus.OK);
    }

    @PostMapping("/convert")
    public User ConvertJsonToJavaObject(@RequestBody User user){
        return user;
    }

}
