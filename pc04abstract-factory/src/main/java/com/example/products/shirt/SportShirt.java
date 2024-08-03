package com.example.products.shirt;

import com.example.products.Shirt;

public class SportShirt implements Shirt{

    //Implementacion de la CAMISA DEPORTIVA

    @Override
    public boolean hasLongSleeves() {
        System.out.println("Camisa deportiva -- Tiene mangas largas? -> No");
        return false;
    }

    @Override
    public boolean hasButtons() {
        System.out.println("Camisa deportiva -- Tiene botones? -> No");
        return false;
    }

}
