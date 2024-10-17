package org.example.facade;

import org.example.subsystems.*;
import org.example.subsystems.interfaces.*;

public class BookingFacade {
    private IAuthentication authenticationSystem;
    private IFlightManagement flightManagement;
    private ISeatAvailability seatAvailability;
    private IPaymentSystem paymentSystem;
    private IRewardSystem rewardSystem;
    private NotificationService notificationService;

    public BookingFacade() {
        this.authenticationSystem = new AuthenticationSystem();
        this.flightManagement = new FlightManagement();
        this.seatAvailability = new SeatAvailability();
        this.paymentSystem = new PaymentSystem();
        this.rewardSystem = new RewardSystem();
        this.notificationService = new NotificationService();
    }

    public void bookFlight(String user, String password, String from, String to, String flight, String flightClass, String creditCard, double amount, String email) {
        if (!authenticationSystem.authenticateUser(user, password)) {
            System.out.println("Booking failed. Authentication error.");
            return;
        }

        try {
            flightManagement.findFlight(from, to, flightClass);
            seatAvailability.checkAvailability(flight, flightClass);
            paymentSystem.processPayment(creditCard, amount, "USD");
            rewardSystem.applyRewardPoints(user, amount);
            notificationService.sendEmail(email, "Your flight from " + from + " to " + to + " has been booked in " + flightClass + " class.", true);
            System.out.println("Flight booking completed successfully.");
        } catch (Exception e) {
            System.out.println("Booking failed due to: " + e.getMessage());
        }
    }
}
