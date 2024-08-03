package com.example.factoryMethod.factory;

import com.example.factoryMethod.Vehiculo;

//tambien podria ser asi
// public abstract class VehicleFactory<T> {

//     public abstract T createVehicle();
// }

public abstract class VehicleFactory {

    public abstract Vehiculo createVehicle();
}
