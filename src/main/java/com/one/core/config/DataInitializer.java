package com.one.core.config;

import com.one.core.model.UserRol;
import com.one.core.model.Userf;
import com.one.core.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner init (UserRepository userRepository, PasswordEncoder passwordEncoder){
        return args -> {
            if(!userRepository.existsByEmail("root@mail.com")){
                Userf root = new Userf();
                root.setEnabled(true);
                root.setRol(UserRol.SUPER_ADMIN);
                root.setName("ROOT");
                root.setEmail("root@mail.com");
                root.setPassword(passwordEncoder.encode("12345"));
                userRepository.save(root);
            }
        };
    }
}
