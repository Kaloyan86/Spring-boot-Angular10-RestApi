package com.restapi.controllers;

import com.restapi.models.User;
import com.restapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    @ResponseBody
    public List<User> getUsers() {
        return this.userRepository.findAll();
    }
}
