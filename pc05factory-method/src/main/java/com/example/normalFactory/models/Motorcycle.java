package com.example.normalFactory.models;

import com.example.normalFactory.Vehiculo;

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
