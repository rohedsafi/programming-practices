package com.example.SecurityPractice.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

// what is the purpose of this class?
// This class implements the UserDetails interface and serves as a wrapper for the Users entity, providing the necessary user details for Spring Security authentication.
public class userPrinciple implements UserDetails {
    private Users user;

    public userPrinciple(Users user) {
        this.user = user;
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() { // This method indicates whether the user's credentials (password) have expired. Returning true means the credentials are valid and not expired.
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
