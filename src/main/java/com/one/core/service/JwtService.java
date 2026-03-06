package com.one.core.service;

import com.one.core.model.UserRol;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import io.micrometer.common.docs.KeyName;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.Instant;
import java.util.Date;


@Service
public class JwtService {
    private final SecretKey key;
    private final Long expirationMillis = 1000L * 60 * 60;

    public JwtService(@Value("${security.jwt.secret}") String secret){
        this.key = Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));
    }

    public String generateToken(String subjectEmail, UserRol rol){
        var now = new Date();
        var exp = new Date(now.getTime() + expirationMillis);
        return Jwts.builder()
                .subject(subjectEmail)
                .claim("role", rol.name())
                .issuedAt(now)
                .expiration(exp)
                .signWith(key)
                .compact();
    }

    public Claims parseClaims (String token){
        return Jwts.parser()
                .verifyWith(key)
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }

    public String extractEmail(String token){
        return parseClaims(token).getSubject();
    }

    public String extractRole(String token){
        Object role = parseClaims(token).get("role");
        return role == null ? null : role.toString();
    }
}
