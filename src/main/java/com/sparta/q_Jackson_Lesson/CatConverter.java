package com.sparta.q_Jackson_Lesson;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

// To convert our data from an object to a json file
public class CatConverter {
    private final ObjectMapper mapper = new ObjectMapper();

    String objectToJson(Object o) throws JsonProcessingException {
        return mapper.writeValueAsString(o);
    }

    public void objectToJsonFile(String pathName, Object o) throws IOException {
        mapper.writeValue(new File(pathName), o);
    }

    public String objectToXml(Cat cat) throws JsonProcessingException {
        XmlMapper mapper = new XmlMapper();
        return mapper.writeValueAsString(cat);
    }

    public Cat jsonToObject(String s) throws JsonProcessingException {
        return mapper.readValue(s, Cat.class);
    }


}
