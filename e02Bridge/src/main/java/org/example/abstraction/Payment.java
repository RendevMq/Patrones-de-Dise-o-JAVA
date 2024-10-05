package org.example.abstraction;

import org.example.implementation.PaymentGateway;

//Define el comportamiento general de un pago.
public abstract class Payment {

    protected PaymentGateway paymentGateway;

    public Payment(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public abstract void makePayment(double amount);
}
