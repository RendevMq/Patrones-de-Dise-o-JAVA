package com.example.factories;

import com.example.ClothesFactory;
import com.example.products.Shirt;
import com.example.products.Shoe;
import com.example.products.Trousers;
import com.example.products.shirt.GalaShirt;
import com.example.products.shoe.GalaShoe;
import com.example.products.trousers.GalaTrousers;

//FABRICA DE ROPA DE GALA
//Implementa CLOTHES FACTORY (La fabrica general)
//Los metodos me devolveran la FAMILIA DE OBJETOS DE GALA

public class GalaClothesFactory implements ClothesFactory{

    @Override
    public Shoe createShoes() {
        return new GalaShoe();
    }

    @Override
    public Shirt createShirt() {
        return new GalaShirt();
    }

    @Override
    public Trousers creaTrousers() {
        return new GalaTrousers();
    }

}
