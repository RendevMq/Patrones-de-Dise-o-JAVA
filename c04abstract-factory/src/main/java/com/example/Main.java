package com.example;

import com.example.factories.GalaClothesFactory;
import com.example.factories.SportClothesFactory;
import com.example.products.Shirt;
import com.example.products.shirt.GalaShirt;
import com.example.products.shirt.SportShirt;
import com.example.products.shoe.GalaShoe;
import com.example.products.shoe.SportShoe;
import com.example.products.trousers.GalaTrousers;
import com.example.products.trousers.SportTrousers;

public class Main {
    public static void main(String[] args) {
        
        //====FABRICA DE ROPA DEPORTIVA====//
        ClothesFactory sportClothesFactory = new SportClothesFactory();

        //Shirt sportShirt = sportClothesFactory.createShirt(); //o tambien, mas especificos
        SportShirt sportShirt = (SportShirt) sportClothesFactory.createShirt();
        SportShoe sportShoe = (SportShoe) sportClothesFactory.createShoes();
        SportTrousers sportTrousers = (SportTrousers) sportClothesFactory.creaTrousers();

        System.out.println("\n---> Ejmplo de ropa deportiva <---");
        sportShirt.hasButtons();
        sportTrousers.getClosureType();
        sportShoe.isRunningShoes();

        //====FABRICA DE ROPA DE GALA====//
        ClothesFactory galaClothesFactory = new GalaClothesFactory();

        //Shirt galaShirt = galaClothesFactory.createShirt(); //o tambien, mas especificos
        GalaShirt galaShirt = (GalaShirt) galaClothesFactory.createShirt();
        GalaShoe galaShoe = (GalaShoe) galaClothesFactory.createShoes();
        GalaTrousers galaTrousers = (GalaTrousers) galaClothesFactory.creaTrousers();

        System.out.println("\n---> Ejmplo de ropa de gala <---");
        galaShirt.hasButtons();
        galaTrousers.getClosureType();
        galaShoe.isRunningShoes();

    }
}