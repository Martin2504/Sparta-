package com.sparta.d_OOP_Task;
public class Starter {
    public static void start() {

        Lion Lion1 = new Lion(4, "jungle");
        System.out.println(Lion1.hasTail());
        System.out.println(Lion1.getHabitat());
        System.out.println();
        System.out.println(Lion1.eat());
        System.out.println(Lion1.eat("meat"));

    }


}
