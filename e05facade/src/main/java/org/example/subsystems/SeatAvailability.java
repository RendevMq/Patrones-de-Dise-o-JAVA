package org.example.subsystems;

import org.example.subsystems.interfaces.ISeatAvailability;

public class SeatAvailability implements ISeatAvailability {
    @Override
    public void checkAvailability(String flight, String flightClass) {
        System.out.println("Checking seat availability for flight: " + flight + " in " + flightClass + " class.");
        if ("AA101".equals(flight)) {
            System.out.println("Seats available in " + flightClass);
        } else {
            System.out.println("No seats available.");
            throw new RuntimeException("Seats not available for the selected flight.");
        }
    }
}
