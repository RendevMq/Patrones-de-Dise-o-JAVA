package com.example;

/**
 * Reglas:
 * 1) Debemos tener un constructor PRIVADO 
 * 2) Debemos tener un ATRIBUTO PRIVADO ESTATICO 
 * 3) Debemos tener un METODO ESTATICO de devuelva la instancia 
 */

public class DatabaseConnector {

    private static DatabaseConnector databaseConnector;

    private DatabaseConnector(){
        System.out.println("Objeto Creado");
    }

    private static DatabaseConnector getInstance(){
        //Con esto, ya implementamos el patron Singleton
        if (databaseConnector == null) {
            databaseConnector = new DatabaseConnector();
        }
        return databaseConnector;
    }
}
