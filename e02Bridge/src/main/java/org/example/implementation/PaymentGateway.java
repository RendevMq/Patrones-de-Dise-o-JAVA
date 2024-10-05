package org.example.implementation;

//Define la interfaz para las pasarelas de pago.
public interface  PaymentGateway {

    void processPayment(double amount);

}
