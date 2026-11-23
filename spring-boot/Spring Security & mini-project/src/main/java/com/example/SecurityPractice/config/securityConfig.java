package com.example.SecurityPractice.config;

import com.example.SecurityPractice.Service.myUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class securityConfig {

    @Autowired
    private JwtFilter jwtFilter;

    private final myUserDetail userDetailService;
    securityConfig(myUserDetail userDetailService) {
        this.userDetailService = userDetailService;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception { // SecurityFilterChain is an interface in Spring Security that defines a contract for configuring the security filter chain. It allows you to customize the security settings for your application, such as authentication, authorization, and other security-related configurations. The SecurityFilterChain is responsible for processing incoming requests and applying the defined security rules before allowing access to protected resources.
        return httpSecurity
                .csrf(customizer -> customizer.disable())
                .cors(Customizer.withDefaults())
                .authorizeHttpRequests(request -> request
                        .requestMatchers("/", "/login.html", "/signup.html", "/auth.css", "/auth.js",
                                "/register", "/login").permitAll()
                        .anyRequest().authenticated())
                .httpBasic(Customizer.withDefaults()) // Enables HTTP Basic authentication, which is a simple authentication scheme built into the HTTP protocol. It allows clients to provide a username and password when making requests to the server. In this configuration, it is used to secure the application by requiring users to authenticate with their credentials before accessing any resources.
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class) // Adds a custom JWT filter (jwtFilter) to the Spring Security filter chain before the UsernamePasswordAuthenticationFilter. This filter is responsible for intercepting incoming requests and validating the JWT token provided in the request headers. If the token is valid, it allows the request to proceed; otherwise, it denies access.
                .build();
    }

    @Bean
    // This method defines a bean for the AuthenticationProvider, which is responsible for authenticating users in Spring Security. It uses a custom UserDetailsService (myUserDetail) to retrieve user details from a data source (e.g., database) and authenticate users based on their username and password.
    public AuthenticationProvider authenticationProvider() { // AuthenticationProvider is an interface in Spring Security that defines a contract for authenticating users. It provides a way to verify user credentials and determine if the user is authenticated or not.
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider(userDetailService); // DaoAuthenticationProvider is a concrete implementation of the AuthenticationProvider interface that uses a UserDetailsService to retrieve user details from a data source (e.g., database) and authenticate users based on their username and password.
        provider.setPasswordEncoder(passwordEncoder()); // Set the password encoder to be used for encoding and verifying passwords. In this case, it uses the passwordEncoder() method defined in the same class, which returns a BCryptPasswordEncoder instance. This ensures that passwords are securely hashed and verified during authentication.
        return provider;
    }
    @Bean
    public PasswordEncoder passwordEncoder(){ // PasswordEncoder is an interface in Spring Security that defines a contract for encoding and verifying passwords. It provides methods for hashing passwords and checking if a raw password matches an encoded password. Implementations of this interface are used to securely store and verify user passwords in authentication systems.
        return new BCryptPasswordEncoder(); // BCryptPasswordEncoder is a password encoder implementation provided by Spring Security that uses the BCrypt hashing algorithm to securely hash and verify passwords. It is a widely used and recommended approach for storing passwords in a secure manner, as it adds a salt to the password before hashing, making it more resistant to brute-force attacks and rainbow table attacks.
    }


    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception { // AuthenticationManager is an interface in Spring Security that defines a contract for managing authentication. It is responsible for processing authentication requests and determining if the provided credentials are valid or not. The AuthenticationManager is typically used to authenticate users based on their username and password, and it can delegate the authentication process to one or more AuthenticationProvider implementations.
        return configuration.getAuthenticationManager(); // This line retrieves the AuthenticationManager instance from the provided AuthenticationConfiguration. The AuthenticationConfiguration is a configuration class that holds the necessary information for setting up authentication in Spring Security. By calling getAuthenticationManager(), we obtain the configured AuthenticationManager that can be used to authenticate users based on their credentials.
    }



















    // this is the code for in memory authentication without database
//    @Bean
//    public UserDetailsService userDetailsService() { // what is UserDetailsService?
//        // UserDetailsService is an interface in Spring Security that provides a way to retrieve user-related data.
//        // It has a single method, loadUserByUsername(String username),
//        // which is used to look up a user by their username and return a UserDetails object containing the user's information,
//        // such as username, password, and authorities.
//        // This interface is typically implemented to integrate with custom user data sources, such as databases or external services.
//
//        UserDetails user1 = User
//                .withDefaultPasswordEncoder() // Create a UserDetails object with default password encoder
//                .username("rohed") // // Set the username for the user
//                .password("rohed123") // Set the password for the user (noop indicates no encoding)
//                .roles("USER") // Assign the role "USER" to the user
//                .build(); // Build the UserDetails object
//        UserDetails user2 = User
//                .withDefaultPasswordEncoder() // Create a UserDetails object with default password encoder
//                .username("safi") // Set the username for the user
//                .password("safi123") // Set the password for the user (noop indicates no encoding)
//                .roles("ADMIN") // Assign the role "ADMIN" to the user
//                .build(); // Build the UserDetails object
//
//        return new InMemoryUserDetailsManager(user1 , user2); // InMemoryUserDetailsManager is an implementation of UserDetailsService that stores user details in memory.
//    }
}
