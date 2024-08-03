package com.example.factoryMethod.factory;

import com.example.factoryMethod.Vehiculo;
import com.example.factoryMethod.models.Car;

public class CarFactory extends VehicleFactory{

    @Override
    public Vehiculo createVehicle() {
        return new Car();
    }

}
