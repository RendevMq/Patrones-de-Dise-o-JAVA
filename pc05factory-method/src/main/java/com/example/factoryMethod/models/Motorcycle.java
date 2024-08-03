package com.example.factoryMethod.models;

import com.example.factoryMethod.Vehiculo;

public class Motorcycle implements Vehiculo{

    @Override
    public void start() {
        System.out.println("---> Run motorcycle!!");

    }

    @Override
    public void stop() {
        System.out.println("---> Run motorcycle!!");
    }
}
