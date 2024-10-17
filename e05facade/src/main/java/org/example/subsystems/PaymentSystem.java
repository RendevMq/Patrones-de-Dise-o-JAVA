package org.example.subsystems;

import org.example.subsystems.interfaces.IPaymentSystem;

public class PaymentSystem implements IPaymentSystem {
    @Override
    public void processPayment(String creditCard, double amount, String currency) {
        System.out.println("Processing payment with card: " + creditCard);
        if (validateCreditCard(creditCard)) {
            double tax = calculateTax(amount, currency);
            double total = amount + tax;
            System.out.println("Payment processed. Total amount with tax: " + total);
        } else {
            System.out.println("Payment failed. Invalid card.");
            throw new RuntimeException("Payment declined.");
        }
    }

    private boolean validateCreditCard(String creditCard) {
        return creditCard.startsWith("1234");  // Simulación de validación
    }

    private double calculateTax(double amount, String currency) {
        System.out.println("Calculating tax for currency: " + currency);
        return amount * 0.15; // Simulación de cálculo de impuestos (15%)
    }
}