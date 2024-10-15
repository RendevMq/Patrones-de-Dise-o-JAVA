package org.example;

import org.example.decorators.*;

public class Main {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        // Aplicamos los decoradores: Logging -> Compression -> Encryption -> FileDataSource
        DataSourceDecorator encoded = new LoggingDecorator(        // Nuevo decorador agregado
                                            new CompressionDecorator(
                                                    new EncryptionDecorator(
                                                            new FileDataSource("out/OutputDemo.txt"))));

        // Escribimos los datos utilizando el decorador
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());

        
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}