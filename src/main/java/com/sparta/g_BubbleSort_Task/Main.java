package com.sparta.g_BubbleSort_Task;

public class Main {
    public static void main(String[] args) {
        int[] unsortedIntArray = {3, 7, 23, 4, 1, 11};
        System.out.print("Primary array { ");
        ArrayPrinter.printArray(unsortedIntArray);
        System.out.println(" }");
        System.out.print("Sorted array { ");
        BubbleSort.sortArray(unsortedIntArray);
        System.out.println(" }");
    }

}
