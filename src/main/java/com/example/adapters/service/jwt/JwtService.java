package com.example.adapters.service.jwt;

import io.smallrye.jwt.build.Jwt;
import jakarta.inject.Singleton;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Singleton
public class JwtService {
    public String generateToken() {
        Set<String> roles = new HashSet<>(
                Arrays.asList("admin", "writer")
        );
        return Jwt.issuer("jwt")
                .subject("jwt")
                .groups(roles).expiresAt(System.currentTimeMillis() + 1000 * 60 * 60 * 24)
                .sign();
    }
}
