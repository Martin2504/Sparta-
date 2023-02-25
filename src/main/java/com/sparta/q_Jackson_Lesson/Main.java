package com.sparta.q_Jackson_Lesson;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.time.LocalDate;


// {"name":"Fudge","dob":"2015-March-05","priority":0}
public class Main {
    public static void main(String[] args) {
        Cat fudge = new Cat("Fudge", LocalDate.of(2015, 3, 5), 0);
        System.out.println(fudge.toString());

        Cat pluto = new Cat("Pluto", LocalDate.of(2016, 01, 06), 0);
        Cat[] cats = {fudge, pluto};


        CatConverter conv = new CatConverter();
        try {
            // print object cats array in Json
            System.out.println(conv.objectToJson(cats));
            // print object in xml
            System.out.println(conv.objectToXml(fudge));
            // print Json as object
            System.out.println(conv.jsonToObject("{\"name\":\"Fudge\",\"dob\":\"2015-March-05\",\"priority\":0}"));
            // write to a Json file the cats array
            conv.objectToJsonFile("src/main/resources/cats.json", cats);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
