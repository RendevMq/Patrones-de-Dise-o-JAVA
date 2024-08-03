package com.example.factoryMethod.factory;

import com.example.factoryMethod.Vehiculo;
import com.example.factoryMethod.models.Truck;

public class TruckFactory extends VehicleFactory{

    @Override
    public Vehiculo createVehicle() {
        return new Truck();
    }

}
