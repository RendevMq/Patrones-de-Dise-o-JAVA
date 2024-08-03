package com.example.normalFactory.factory;

import com.example.normalFactory.Vehiculo;
import com.example.normalFactory.models.Car;
import com.example.normalFactory.models.Motorcycle;
import com.example.normalFactory.models.Plane;
import com.example.normalFactory.models.Truck;

public class VehicleFactory {
    //Factory method
    public Vehiculo createVehicle(String typeOfVehicle){

        if (typeOfVehicle.equalsIgnoreCase("Car")) {
            return new Car();
        }
        if (typeOfVehicle.equalsIgnoreCase("Motorcycle")) {
            return new Motorcycle();
        }
        if (typeOfVehicle.equalsIgnoreCase("Truck")) {
            return new Truck();
        }
        if (typeOfVehicle.equalsIgnoreCase("Plane")) {
            return new Plane();
        }

        return null;
    }
}
