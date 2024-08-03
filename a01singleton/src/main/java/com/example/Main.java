package com.example;

public class Main {
    public static void main(String[] args) {

        //Creamos los objetos
        //Luego de que se instancie el obejto, el objeto en memoria siempre sera el mismo
        DatabaseConnector databaseConnector1 = DatabaseConnector.getInstance();
        System.out.println("databaseConnector1 = " + databaseConnector1); //...@36baf30c
        
        DatabaseConnector databaseConnector2 = DatabaseConnector.getInstance();
        System.out.println("databaseConnector2 = " + databaseConnector2); //...@36baf30c

        System.out.println("");

        databaseConnector1.connectDatabase(); // ...DatabaseConnector@36baf30c
        databaseConnector2.connectDatabase(); // ...DatabaseConnector@36baf30c

    }
}