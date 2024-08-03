package com.example.factories;

import com.example.ClothesFactory;
import com.example.products.Shirt;
import com.example.products.Shoe;
import com.example.products.Trousers;
import com.example.products.shirt.SportShirt;
import com.example.products.shoe.SportShoe;
import com.example.products.trousers.SportTrousers;

//FABRICA DE ROPA DEPORTIVA
//Implementa CLOTHES FACTORY (La fabrica general)
//Los metodos me devolveran la FAMILIA DE OBJETOS

public class SportClothesFactory implements ClothesFactory{

    @Override
    public Shoe createShoes() {
        return new SportShoe();
    }

    @Override
    public Shirt createShirt() {
        return new SportShirt();
    }

    @Override
    public Trousers creaTrousers() {
        return new SportTrousers();
    }

}
