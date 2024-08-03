package com.example;

/**
 * Reglas:
 * 1) Debemos tener un constructor PRIVADO 
 * 2) Debemos tener un ATRIBUTO PRIVADO ESTATICO 
 * 3) Debemos tener un METODO ESTATICO de devuelva la instancia 
 */

public class DatabaseConnector {

    private static DatabaseConnector databaseConnectorInstance;

    private DatabaseConnector(){
        System.out.println("Objeto Creado");
    }

    public static synchronized DatabaseConnector getInstance(){ //synchronized, misma instancia por si se trabaja con mas hilos
        //Con esto, ya implementamos el patron Singleton
        //Si ya fue creado, me retorna el mismo objeto en memoria
        if (databaseConnectorInstance == null) {
            databaseConnectorInstance = new DatabaseConnector();
        }
        return databaseConnectorInstance;
    }
    public void connectDatabase(){

        if(databaseConnectorInstance == null){
            throw new NullPointerException("La instancia no ha sido creada");
        }
        System.out.println("Conectando a la base de datos... " + databaseConnectorInstance);
    }

    public void disconnectDatabase(){

        if(databaseConnectorInstance == null){
            throw new NullPointerException("La instancia no ha sido creada");
        }
        System.out.println("Desconectando la base de datos... " + databaseConnectorInstance);
    }
}
