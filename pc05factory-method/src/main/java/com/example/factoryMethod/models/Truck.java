package com.example.factoryMethod.models;

import com.example.factoryMethod.Vehiculo;

public class Truck implements Vehiculo{

    @Override
    public void start() {
        System.out.println("---> Run truck!!");
    }

    @Override
    public void stop() {
        System.out.println("---> Run truck!!");
    }

}
