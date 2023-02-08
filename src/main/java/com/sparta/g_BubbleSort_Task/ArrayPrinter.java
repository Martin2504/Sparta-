package com.sparta.g_BubbleSort_Task;

public class ArrayPrinter {
    public static void printArray(int[] primarySorted) {

        int n = primarySorted.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(primarySorted[i] + " ");
        }
    }
}
