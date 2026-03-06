package com.one.core.service;

import com.one.core.config.AuthUserDetails;
import com.one.core.model.Userf;
import com.one.core.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public AuthUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Userf user = userRepository.findByEmail(email)
                .orElseThrow( () -> new UsernameNotFoundException("User not found"));
        return new AuthUserDetails(user);
    }
}
