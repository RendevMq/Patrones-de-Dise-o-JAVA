package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import com.example.adapter.FileAdapter;
import com.example.adapter.InputFile;
import com.example.adapter.csv.CsvFileAdapter;
import com.example.adapter.excel.ExcelFileAdapter;
import com.example.model.Person;

//Crearemos diferentes adaptadores, pero al final se va a trabajar de la 
//misma forma en el metodo main para leer los archivos.

public class Main {

    private static final String path =
            //"e01adapter" + File.separator +
            "src" + File.separator +
            "main" + File.separator +
            "resources" + File.separator +
            "Files" + File.separator;
    public static void main(String[] args) throws FileNotFoundException {
        //Leemos el EXCEL
        /*InputFile excelFileAdapter = new ExcelFileAdapter();
        FileAdapter fileAdapter = new FileAdapter(excelFileAdapter); //ADAPTADOR DE EXCEL
        InputStream inputStream = new FileInputStream(path + "ArchivoExcel.xlsx");*/

        //Leemos el CSV
        InputFile csvFileAdapter = new CsvFileAdapter();
        FileAdapter fileAdapter = new FileAdapter(csvFileAdapter); //ADAPTADOR DE CSV
        InputStream inputStream = new FileInputStream(path + "ArchivoCSV.txt");

        //Leemos el JSON



        //Leemos el XML


        List<Person> personList = fileAdapter.readFile(inputStream);
        System.out.println(personList);

    }
}