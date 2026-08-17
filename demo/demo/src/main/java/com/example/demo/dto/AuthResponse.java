package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AuthResponse {

    private String token;
    private String tokenType = "Bearer";
    private String refreshToken;

    public AuthResponse(String token) {
        this.token = token;
    }

    public AuthResponse(String token, String refreshToken) {
        this.token = token;
        this.tokenType = "Bearer";
        this.refreshToken = refreshToken;
    }
}
