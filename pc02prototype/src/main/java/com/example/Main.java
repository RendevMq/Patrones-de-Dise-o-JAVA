package com.example;

import java.util.List;

import com.example.prototype.PriceList;
import com.example.prototype.Product;

public class Main {
    public static void main(String[] args) {
        // Lista de precios inicial
        PriceList priceList1 = new PriceList("Primera Lista");
        List<Product> productList = List.of(new Product("Computadora", 650000),
                                            new Product("Mouse", 120000),
                                            new Product("Teclado", 80000),
                                            new Product("Pantalla", 1350000),
                                            new Product("Auriculares", 40000));
        priceList1.setProductList(productList);

        System.out.println(priceList1); //5ca881b5 - .... PERO los productos apuntan al mismo

        //===CREAMOS SEGUNDA LISTA DE PRECIOS===//
        PriceList priceList2 = (PriceList) priceList1.clone(); //CLONACION SIMPLE
        priceList2.setName("Segunda Lista");
        System.out.println(priceList2 + "\n"); //1b28cdfa - .... PERO los productos apuntan al mismo

        //===CAMBIAMOS EL PRECIO DE LA LISTA2===//
        for (Product product : priceList2.getProductList()) {
            product.setPrice(product.getPrice()*0.9);
        }
        //Afecta tanto a la lista1 como la 2, clonacion simple
        System.out.println(priceList2); 
        System.out.println(priceList1 + "\n");


        //===CREAMOS TERCERA LISTA DE PRECIOS===//
        PriceList priceList3 = (PriceList) priceList1.deepClone(); //CLONACION PROFUNDA
        priceList3.setName("Segunda Lista");
        System.out.println(priceList3); //eed1f14 - .... los productos apuntan a referencias diferentes
    }
}