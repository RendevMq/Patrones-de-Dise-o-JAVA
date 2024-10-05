package org.example.abstraction;

import org.example.implementation.PaymentGateway;


public class CardPayment extends Payment{

    public  CardPayment(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Processing card payment...");
        paymentGateway.processPayment(amount);
    }
}
