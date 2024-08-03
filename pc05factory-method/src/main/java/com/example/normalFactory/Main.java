package com.example.normalFactory;

import com.example.normalFactory.factory.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehiculo car = vehicleFactory.createVehicle(TypeOfVehicle.CAR.name());
        Vehiculo truck = vehicleFactory.createVehicle(TypeOfVehicle.TRUCK.name());
        Vehiculo motorcycle = vehicleFactory.createVehicle(TypeOfVehicle.MOTORCYCLE.name());
        Vehiculo plane = vehicleFactory.createVehicle(TypeOfVehicle.PLANE.name());

        car.start();
        truck.start();
        motorcycle.start();
        plane.start();
    }
}