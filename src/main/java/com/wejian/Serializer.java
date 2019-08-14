package com.wejian;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Serializer {

    private static String outFile = "test.json";

    public static void main(String[] args) throws IOException {
//        List<Animal> animals = new ArrayList<>();
//        animals.add(new Lion("Simba", 1));
//        animals.add(new Bird("Tony", "ChiuChiuChiu"));

//        Animal animal = new Lion("Simba", 1);
        Animal animal = new Bird("Tony", "ChiuChiuChiu");

        ObjectMapper mapper =  new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(outFile), animal);
    }
}
