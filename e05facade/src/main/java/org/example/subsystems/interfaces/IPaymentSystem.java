package org.example.subsystems.interfaces;

public interface IPaymentSystem {
    void processPayment(String creditCard, double amount, String currency);
}
