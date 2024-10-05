package org.example.abstraction;

import org.example.implementation.PaymentGateway;

public class WalletPayment extends Payment{

    public WalletPayment(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing card payment...");
        paymentGateway.processPayment(amount);
    }
}
