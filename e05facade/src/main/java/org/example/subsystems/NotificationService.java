package org.example.subsystems;

public class NotificationService {
    public void sendEmail(String email, String message, boolean isPriority) {
        // Validar si el correo es válido
        if (!email.contains("@")) {
            System.out.println("Invalid email address.");
            throw new IllegalArgumentException("Invalid email address.");
        }

        if (isPriority) {
            System.out.println("Sending priority email to " + email + ": " + message);
        } else {
            System.out.println("Sending email to " + email + ": " + message);
        }
    }
}