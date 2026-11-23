package com.example.SecurityPractice.Service;


import com.example.SecurityPractice.Model.Users;
import com.example.SecurityPractice.Repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    AuthenticationManager authManager;

    @Autowired
    private JWTService jwtService;

    @Autowired
    public PasswordEncoder passwordEncoder;

    private final userRepo userRepository;
    @Autowired
    UserService(userRepo userRepository){
        this.userRepository = userRepository;
    }

    public Users registerUser(Users user) {
        user.setPassword(passwordEncoder.encode(user.getPassword())); // Encode the user's password before saving it to the database for security purposes.
        return userRepository.save(user);
    }

    public String verifyUser(Users user) {
        Authentication authentication = // Authenticate the user using the provided username and password. The UsernamePasswordAuthenticationToken is used to create an authentication token with the user's credentials.
                authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername() , user.getPassword())); // Perform authentication using the AuthenticationManager, which will validate the user's credentials against the stored user details.
        if (authentication.isAuthenticated()) {
            return jwtService.generateToken(user.getUsername()); // If authentication is successful, generate a JWT token for the authenticated user using the JWTService.
        } else {
            return "Invalid credentials";
        }
    }
}
