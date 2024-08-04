package com.example.adapter.csv;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

import com.example.adapter.InputFile;
import com.example.model.Person;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class CsvFileAdapter implements InputFile {

    @Override
    public List<Person> readFile(InputStream inputStream) {
        Reader reader = new InputStreamReader(inputStream);

        ColumnPositionMappingStrategy<Person> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Person.class);
        strategy.setColumnMapping("name","lastName","age"); //nombre de los atributos de Person

        CsvToBean<Person> csvToBean = new CsvToBeanBuilder<Person>(reader) //Conversion a objetos Person
                .withMappingStrategy(strategy)
                .withType(Person.class) //convertimos a Person
                .withSeparator(';')  //separador
                .withSkipLines(1)   //salte la primera linea (cabezales del csv)
                .withIgnoreLeadingWhiteSpace(true) // ignore los espacios en blanco
                .build(); //del patron builder

        List<Person> personList = csvToBean.parse(); //recuperamos la lista
        return personList;
    }

}
