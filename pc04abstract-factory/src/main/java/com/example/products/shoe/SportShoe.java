package com.example.products.shoe;

import com.example.products.Shoe;

public class SportShoe implements Shoe{

    //Implementacion deL ZAPATO DEPORTIVO

    @Override
    public boolean isElegantShoes() {
        System.out.println("Zapatos deportivos -- Son zapatos elegantes? -> No");
        return false;
    }

    @Override
    public boolean isRunningShoes() {
        System.out.println("Zapatos deportivos -- Son zapatos para correr? -> Si");
        return true;
    }

}
