package com.example;

import com.example.products.Shirt;
import com.example.products.Shoe;
import com.example.products.Trousers;

public interface ClothesFactory {

    //Esta interfaz nos sirve para crear diferentes tipos de objetos
    Shoe createShoes();
    Shirt createShirt();
    Trousers creaTrousers();
}
