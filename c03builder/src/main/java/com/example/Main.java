package com.example;

import com.example.domain.Address;
import com.example.domain.Contact;
import com.example.domain.Phone;

public class Main {
    public static void main(String[] args) {
        
        // Employee employee = new Employee();

        // Address address = new Address();
        // employee.setAddress(address);

        // //y asi crear los demas objetos.. la idea es evitarlo

        //El metodo build es el que se encarga de tomar todo y juntarlo en un 
        //solo objeto.. siempre que veamos una estructura similar significa que
        //se esta implementando el patro de diseno builder
        Employee employee = new Employee.EmployeeBuilder()
                            .setAge(24)
                            .setName("Santiago")
                            .setGender("Male")

                            .setAddress(new Address("Av. Lima 4545" , "Lima" , "Peru" , "15663"))
                            .setAddress("Av. brasil 4545" , "Lima" , "Peru" , "45121")

                            .setPhone(new Phone("13245","212","Fijo"))
                            .setPhone("23132132", "5445", "Cel")

                            .setContact(new Contact("Daniel" , 
                                new Phone("125454","54554","Fijo"),
                                new Address("Av. Lima 4545" , "Lima" , "Peru" , "15663")))
                            .build();

        System.out.println("employee = " + employee);
    }
}