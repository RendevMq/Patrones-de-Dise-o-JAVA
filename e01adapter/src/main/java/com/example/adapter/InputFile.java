package com.example.adapter;

import java.io.InputStream;
import java.util.List;

import com.example.model.Person;

public interface InputFile {

    //En el argumento recibimos el archivo, en csv,json,etc
    //y convertiremos el archivo a un listado de objetos
    List<Person> readFile(InputStream inputStream); 
    
} 
