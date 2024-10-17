package org.example.subsystems;

import org.example.subsystems.interfaces.IAuthentication;

public class AuthenticationSystem implements IAuthentication {
    @Override
    public boolean authenticateUser(String user, String password) {
        System.out.println("Authenticating user: " + user);
        if ("FrequentFlyer123".equals(user) && "password123".equals(password)) {
            System.out.println("User authenticated successfully.");
            return true;
        } else {
            System.out.println("Authentication failed for user: " + user);
            return false;
        }
    }
}
