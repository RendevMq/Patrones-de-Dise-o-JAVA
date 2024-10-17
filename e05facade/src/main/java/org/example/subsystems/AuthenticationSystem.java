package org.example.subsystems;

public class AuthenticationSystem {
    public boolean authenticateUser(String user, String password) {
        System.out.println("Authenticating user: " + user);
        // Lógica simulada de autenticación
        if ("FrequentFlyer123".equals(user) && "password123".equals(password)) {
            System.out.println("User authenticated successfully.");
            return true;
        } else {
            System.out.println("Authentication failed for user: " + user);
            return false;
        }
    }
}
