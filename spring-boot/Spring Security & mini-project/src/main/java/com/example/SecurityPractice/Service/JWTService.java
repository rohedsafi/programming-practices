package com.example.SecurityPractice.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.websocket.Decoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;


@Service
public class JWTService {

    private final String secretKey ; // Replace with a strong, secure secret key in production

    public JWTService() throws NoSuchAlgorithmException {
        KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");
        SecretKey sk = keyGen.generateKey();
        this.secretKey = Base64.getEncoder().encodeToString(sk.getEncoded());
    }

    public String generateToken(String username) {
        Map<String , Object> claims = new HashMap<>();

        return Jwts.builder()
                .claims()
                .add(claims)
                .subject(username)
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10)) // Token expires in 10 hours
                .and()
                .signWith(Getkey()) // Sign the token using the HS256 algorithm and a secret key. The secret key should be kept secure and not hardcoded in production applications.
                .compact();

}

    private SecretKey Getkey() {
        byte [] keyBytes = Base64.getDecoder().decode(secretKey); // Decode the Base64-encoded secret key to obtain the original byte array representation of the key. This is necessary because the secret key is stored as a Base64-encoded string for safe storage and transmission.
        return Keys.hmacShaKeyFor(keyBytes); // Create a Key object using the decoded byte array and the HMAC-SHA algorithm. The Keys.hmacShaKeyFor() method is a utility method provided by the JJWT library to create a Key object suitable for signing JWTs using the HMAC-SHA algorithm.
    }

    // Extract username from the token's "sub" claim
    public String extractUserName(String token) {
        return extractClaim(token, Claims::getSubject);
    }
    // Generic method to extract ANY claim from the token
    private <T> T extractClaim(String token, Function<Claims, T> claimResolver) {
        final Claims claims = extractAllClaims(token);
        return claimResolver.apply(claims);
    }

    // Decode the token and extract ALL claims (payload)
    private Claims extractAllClaims(String token) {
        return Jwts.parser()
                .verifyWith(Getkey())       // ✅ JJWT 0.12+ (was .setSigningKey())
                .build()
                .parseSignedClaims(token)   // ✅ JJWT 0.12+ (was .parseClaimsJws())
                .getPayload();              // ✅ JJWT 0.12+ (was .getBody())
    }

    // Check if the token is still valid (not expired + username matches)
    public boolean validateToken(String token, UserDetails userDetails) {
        final String username = extractUserName(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }

    // Check if the token's expiration time has passed
    private boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    // Extract the expiration date from the token
    private Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }
}
