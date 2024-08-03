package com.example.normalFactory.models;

import com.example.normalFactory.Vehiculo;

public class Plane implements Vehiculo{

    @Override
    public void start() {
        System.out.println("---> Run plane!!");
    }

    @Override
    public void stop() {
        System.out.println("---> Run plane!!");
    }

    public void fly(){
        System.out.println("---> Take off the plane!!");
    }

}
