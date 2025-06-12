package com.example.Identity_service.service;

import com.example.Identity_service.dto.request.AuthenticationRequest;
import com.example.Identity_service.entity.User;
import com.example.Identity_service.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE,makeFinal = true)
public class AuthenticationService {
    UserRepository userRepository;

    boolean authenticate(AuthenticationRequest request) {
        var user = userRepository.findByUsername(request.getUsername());


    }
}
