package org.example;

import org.example.abstraction.CardPayment;
import org.example.abstraction.Payment;
import org.example.abstraction.WalletPayment;
import org.example.implementation.PaypalGateway;
import org.example.implementation.StripeGateway;

public class Main {
    public static void main(String[] args) {
        System.out.println("Patron Bridge");

        //Pago con tarjeta con Stripe
        Payment paymentCardStripe = new CardPayment(new StripeGateway());
        paymentCardStripe.makePayment(100.0);
        //Pago con monedero digital con Stripe
        Payment paymentWalletStripe = new WalletPayment(new StripeGateway());
        paymentWalletStripe.makePayment(200.0);

        //Pago con tarjeta con Paypal
        Payment paymentCardPaypal = new CardPayment(new PaypalGateway());
        paymentCardPaypal.makePayment(100.0);
        //Pago con monedero digital con Paypal
        Payment paymentWalletPaypal = new WalletPayment(new PaypalGateway());
        paymentWalletPaypal.makePayment(200.0);

    }
}