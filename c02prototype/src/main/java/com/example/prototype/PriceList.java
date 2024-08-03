package com.example.prototype;

import java.util.ArrayList;
import java.util.List;

public class PriceList implements IPrototype{

    private String name;
    private List<Product> productList;

    
    public PriceList(String name) {
        this.productList = new ArrayList<>();
        this.name = name;
    }

    @Override
    public IPrototype clone() {
        //Creamos un objeto nuevo(distinta direccion), pero con los mismos atributos
        //(apuntan a la misma direccion en memoria) del otro objeto
        PriceList clone = new PriceList(name);
        clone.setProductList(productList);
        return clone;
    }

    @Override
    public IPrototype deepClone() {
        //Clonamos tambien los objetos que estan dentro
        PriceList clone = new PriceList(name);
        List<Product> cloneProducts = new ArrayList<>();

        for (Product product : productList) {
            //iremos clonando los objetos de la lista
            Product cloneProduct= (Product) product.clone();
            cloneProducts.add(cloneProduct);
        }

        clone.setProductList(cloneProducts);
        return clone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() { //Imprimimos la referencia en memoria del objeto
        return Integer.toHexString(System.identityHashCode(this)) + " - PriceList [name=" + name + ", productList=" + productList + "]";
    }
}
