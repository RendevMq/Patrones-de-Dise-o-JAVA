package com.example.normalFactory.models;

import com.example.normalFactory.Vehiculo;

public class Car implements Vehiculo{

    @Override
    public void start() {
        System.out.println("---> Run car!!");
    }

    @Override
    public void stop() {
        System.out.println("---> Stop car!!");

    }

}
