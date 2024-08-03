package com.example.normalFactory.models;

import com.example.normalFactory.Vehiculo;

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
