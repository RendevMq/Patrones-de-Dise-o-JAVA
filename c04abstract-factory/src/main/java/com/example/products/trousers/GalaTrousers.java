package com.example.products.trousers;

import com.example.products.Trousers;

public class GalaTrousers implements Trousers{

    //Implementacion deL los PANTALONES DE GALA

    @Override
    public boolean hasPockets() {
        System.out.println("Pantalones de gala -- Tinen bolsillos? -> Si");
        return true;
    }

    @Override
    public String getClosureType() {
        System.out.println("Pantalones de gala -- Tipo de cierre? -> cierre - cremallera");
        return "cierre - cremallera";
    }

}
