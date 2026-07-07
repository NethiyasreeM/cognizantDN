package com.springrest.jwt.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.springrest.jwt.model.User;
import com.springrest.jwt.repository.UserRepository;

@SpringBootTest
class JwtServiceTest {

    @Autowired
    private JwtService jwtService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @BeforeEach
    void setUp() {
        userRepository.deleteAll();
    }

    @Test
    void authenticateReturnsTokenForUserStoredWithEncodedPassword() {
        userRepository.save(new User("admin", passwordEncoder.encode("admin")));

        String token = jwtService.authenticate("admin", "admin");

        assertThat(token).isNotBlank();
    }
}
