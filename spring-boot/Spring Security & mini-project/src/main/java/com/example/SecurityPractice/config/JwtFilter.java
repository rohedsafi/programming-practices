package com.example.SecurityPractice.config;

import com.example.SecurityPractice.Service.JWTService;
import com.example.SecurityPractice.Service.myUserDetail;
import jakarta.annotation.Nonnull;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
@Component
public class JwtFilter extends OncePerRequestFilter {

    @Autowired
    private JWTService jwtService;

    @Autowired
     ApplicationContext context;

    @Override
    protected void doFilterInternal(@Nonnull HttpServletRequest request, @Nonnull HttpServletResponse response, @Nonnull FilterChain FilterChain) throws IOException, ServletException {
        // Implement JWT validation logic here
        String authHeader = request.getHeader("Authorization");// Get the value of the "Authorization" header from the incoming HTTP request. This header typically contains the JWT token prefixed with "Bearer ".
        String token = null;
        String username = null;
         if(authHeader != null && authHeader.startsWith("Bearer ")){
             token = authHeader.substring(7);
             // validate the token and extract username
             username = jwtService.extractUserName(token);
         }

         if(username != null && SecurityContextHolder.getContext().getAuthentication() == null){
                // load user details from the database
                UserDetails userDetail = context
                        .getBean(myUserDetail.class).loadUserByUsername(username);
             // validate the token
             if(jwtService.validateToken(token , userDetail)){
                 // set authentication in the context
                 UsernamePasswordAuthenticationToken authToken = // Create a new instance of UsernamePasswordAuthenticationToken, which is a Spring Security class that represents an authentication token containing the user's details and authorities (roles). It is used to authenticate the user in the security context.
                         new UsernamePasswordAuthenticationToken(userDetail , null , userDetail.getAuthorities()); // The constructor takes three parameters: the principal (user details), the credentials (null in this case since we are not using a password for authentication), and the authorities (roles) associated with the user. This token will be used to set the authentication in the security context.
                 authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request)); // Set additional details for the authentication token, such as the remote address and session ID, using the WebAuthenticationDetailsSource class. This information can be useful for auditing and logging purposes.
                 SecurityContextHolder.getContext().setAuthentication(authToken); // Set the authentication token in the SecurityContextHolder, which is a Spring Security class that holds the security context for the current thread. By setting the authentication token here, we are effectively authenticating the user for the current request and allowing them to access protected resources.

             }
         }
         FilterChain.doFilter(request , response);

    }

}
