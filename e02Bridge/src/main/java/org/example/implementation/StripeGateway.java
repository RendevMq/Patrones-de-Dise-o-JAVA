package org.example.implementation;

public class StripeGateway implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment through STRIPE: $" + amount);
    }
}
