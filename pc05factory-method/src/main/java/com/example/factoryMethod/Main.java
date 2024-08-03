package com.example.factoryMethod;

import com.example.factoryMethod.factory.CarFactory;
import com.example.factoryMethod.factory.MotorcycleFactory;
import com.example.factoryMethod.factory.PlaneFactory;
import com.example.factoryMethod.factory.TruckFactory;

public class Main {
    public static void main(String[] args) { //psvm
        Vehiculo car = new CarFactory().createVehicle();
        Vehiculo motorcycle = new MotorcycleFactory().createVehicle();
        Vehiculo truck = new TruckFactory().createVehicle();
        Vehiculo plane = new PlaneFactory().createVehicle();

        car.start();
        motorcycle.start();
        truck.start();
        plane.start();
    }
}
