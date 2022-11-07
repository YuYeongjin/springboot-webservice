package com.book.springboot.oauthlogin.config.security;

import com.book.springboot.oauthlogin.oauth.token.AuthTokenProvider;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.Key;

@Configuration
public class JwtConfig {
    private Key randomKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    @Value("Keys.secretKeyFor(SignatureAlgorithm.HS256)")
    private String secret;

    @Bean
    public AuthTokenProvider jwtProvider() {
        return new AuthTokenProvider(secret);
    }
}