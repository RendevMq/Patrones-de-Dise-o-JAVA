package com.example.factoryMethod.factory;

import com.example.factoryMethod.Vehiculo;
import com.example.factoryMethod.models.Plane;

public class PlaneFactory extends VehicleFactory{

    @Override
    public Vehiculo createVehicle() {
        return new Plane();
    }
}   
