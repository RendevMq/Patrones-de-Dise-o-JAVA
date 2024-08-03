package com.example.products.shoe;

import com.example.products.Shoe;

public class GalaShoe implements Shoe{

    //Implementacion deL ZAPATO DE GALA

    @Override
    public boolean isElegantShoes() {
        System.out.println("Zapatos de gala -- Son zapatos elegantes? -> Si");
        return true;
    }

    @Override
    public boolean isRunningShoes() {
        System.out.println("Zapatos de gala -- Son zapatos para correr? -> No");
        return false;
    }

}
