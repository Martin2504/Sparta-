package com.sparta.g_BubbleSort_Task;

public class Main {
    public static void main(String[] args) {
        int primary[] = {3, 7, 23, 4, 1, 11};
        System.out.print("Primary array { ");
        printSorted.print(primary);
        System.out.println(" }");
        System.out.print("Sorted array { ");
        BubbleSort.Bubble(primary);
        System.out.println(" }");
    }

}
