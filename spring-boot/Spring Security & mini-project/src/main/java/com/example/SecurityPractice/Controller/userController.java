package com.example.SecurityPractice.Controller;

import com.example.SecurityPractice.Model.Users;
import com.example.SecurityPractice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(originPatterns = {"http://localhost:*", "http://127.0.0.1:*"})
public class userController {

    @Autowired
    private final UserService service;
    userController(UserService service){
        this.service = service;
    }

    @PostMapping("/register")
    public Users registerUser(@RequestBody Users user){
        return service.registerUser(user);
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody Users user){
        return service.verifyUser(user);
//        return "User logged in successfully";
    }
}
