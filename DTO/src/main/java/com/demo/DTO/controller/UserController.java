package com.demo.DTO.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.DTO.dto.UserLocationDTO;
import com.demo.DTO.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController{

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<UserLocationDTO> getAllUser(){
        return userService.getAllUsersLocation();
    }
}