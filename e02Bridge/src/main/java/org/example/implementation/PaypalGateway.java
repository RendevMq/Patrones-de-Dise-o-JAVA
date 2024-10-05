package org.example.implementation;

public class PaypalGateway implements PaymentGateway{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment through PAYPAL: $" + amount);
    }
}
