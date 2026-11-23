package com.example.SecurityPractice.Service;

import com.example.SecurityPractice.Model.Users;
import com.example.SecurityPractice.Model.userPrinciple;
import com.example.SecurityPractice.Repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class myUserDetail implements UserDetailsService { // what is UserDetailsService?  it is an interface provided by Spring Security that defines a method for retrieving user details based on a username. It is used for authentication and authorization purposes in Spring Security.
    @Autowired
    private userRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) {
        Users user1 = repo.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

       //  here I use userPrinciple class to return the user details, but I can also use the User class provided by Spring Security to return the user details. The User class is a built-in implementation of the UserDetails interface that represents a user in Spring Security. It provides a convenient way to create a UserDetails object with username, password, and authorities (roles) without needing to create a custom implementation like userPrinciple.
        if(user1 == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new userPrinciple(user1);


//        return org.springframework.security.core.userdetails.User.builder()
//                .username(user1.getUsername())
//                .password(user1.getPassword())
//                .roles("USER") // Assign the role "USER" to the user
//                .build();

    }
}
