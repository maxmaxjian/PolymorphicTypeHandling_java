package com.wejian;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Deserializer {
    private static String inFile = "test.json";

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Animal animal = mapper.readValue(new File(inFile), Animal.class);
        System.out.println(animal);
    }
}
