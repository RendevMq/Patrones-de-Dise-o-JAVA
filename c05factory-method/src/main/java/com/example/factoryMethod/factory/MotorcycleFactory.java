package com.example.factoryMethod.factory;

import com.example.factoryMethod.Vehiculo;
import com.example.factoryMethod.models.Motorcycle;

public class MotorcycleFactory extends VehicleFactory{

    @Override
    public Vehiculo createVehicle() {
        return new Motorcycle();
    }

}
