package org.example;

import org.example.facade.BookingFacade;

public class Main {
    public static void main(String[] args) {
        BookingFacade bookingFacade = new BookingFacade();

        String user = "FrequentFlyer123";
        String password = "password123";
        String from = "New York";
        String to = "Los Angeles";
        String flight = "AA101";
        String flightClass = "Business";
        String creditCard = "1234-5678-9876-5432";
        double amount = 800.00;
        String email = "customer@example.com";

        bookingFacade.bookFlight(user, password, from, to, flight, flightClass, creditCard, amount, email);
    }
}