package com.example.products.shirt;

import com.example.products.Shirt;

public class GalaShirt implements Shirt{

    //Implementacion de la CAMISA DE GALA

    @Override
    public boolean hasLongSleeves() {
        System.out.println("Camisa de gala -- Tiene mangas largas? -> Si");
        return true;
    }

    @Override
    public boolean hasButtons() {
        System.out.println("Camisa de gala -- Tiene botones? -> Si");
        return true;
    }
    
}



