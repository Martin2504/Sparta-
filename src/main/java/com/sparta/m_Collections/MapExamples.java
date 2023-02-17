package com.sparta.m_Collections;
import java.util.HashMap;
import java.util.Map;

public class MapExamples {


    public static void run() {
        Map<String, Integer> myMap = new HashMap<>(Map.of("Humza", 1, "Kwabena", 2));

        myMap.put("Michael", 3);
        System.out.println(myMap);

        Map<String, Integer[]> newMap = new HashMap<>(Map.of("Humza", new Integer[]{1, 2}));

    }

}
