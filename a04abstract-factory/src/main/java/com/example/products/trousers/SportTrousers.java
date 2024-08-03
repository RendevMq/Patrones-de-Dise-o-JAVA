package com.example.products.trousers;

import com.example.products.Trousers;

public class SportTrousers implements Trousers{

    //Implementacion deL los PANTALONES DEPORTIVOS

    @Override
    public boolean hasPockets() {
        System.out.println("Pantalones deportivos -- Tinen bolsillos? -> No");
        return false;
    }

    @Override
    public String getClosureType() {
        System.out.println("Pantalones deportivos -- Tipo de cierre? -> Sin cierre");
        return null;
    }

}
