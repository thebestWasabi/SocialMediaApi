package com.example.socialmediaapi.service;

import com.example.socialmediaapi.web.dto.auth.JwtRequest;
import com.example.socialmediaapi.web.dto.auth.JwtResponse;

public interface AuthenticationService {

    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);
}
