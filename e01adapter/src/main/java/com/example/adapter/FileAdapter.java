package com.example.adapter;

import java.io.InputStream;
import java.util.List;

import com.example.model.Person;

public class FileAdapter {
    private InputFile inputFile; //hace referencia a los adaptores que implementen InputFile

    public FileAdapter(InputFile inputFile) {
        this.inputFile = inputFile;
    }

    public List<Person> readFile(InputStream inputStream){
        return this.inputFile.readFile(inputStream);
    }
}
