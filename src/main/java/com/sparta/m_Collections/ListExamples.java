package com.sparta.m_Collections;

import java.util.*;

public class ListExamples {
    public static void run(){
//        List list = new ArrayList<>();
//        list.add("Martin");
//        list.add("Faris");
//        list.add("Samir");
//        list.add("Martin");
//        list.remove("Faris");
//        list.set(0, "Sina");
//        System.out.println(list);
//        list.add(1);        // auto boxing
//        list.add(2);
//        list.add(3);
//        Integer integer1 = Integer.valueOf(1);        // boxing
//        int int1 = (int) integer1;                      // unboxing
//        list.remove(integer1);
//        System.out.println(list.size());
//        System.out.println(list);
//        System.out.println(list.get(0));

        Set mySet = new HashSet(Set.of("Martin", "Sina", "Maria"));

        Set treeSet = new TreeSet(Set.of("Martin", "Sina", "Maria"));
        System.out.println(treeSet);        // alphabetical ordering


    }
}
