package org.example.subsystems;


import org.example.subsystems.interfaces.IFlightManagement;

public class FlightManagement implements IFlightManagement {
    @Override
    public void findFlight(String from, String to, String flightClass) {
        System.out.println("Finding flight from " + from + " to " + to + " in " + flightClass + " class.");
        if ("First Class".equals(flightClass) || "Business".equals(flightClass) || "Economy".equals(flightClass)) {
            System.out.println("Flight found in " + flightClass);
        } else {
            System.out.println("Invalid flight class selected.");
            throw new IllegalArgumentException("Invalid flight class");
        }
    }
}