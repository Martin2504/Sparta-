package com.sparta.g_BubbleSort_Task;

public class BubbleSort {
    public static int[] Bubble(int primary[]) {
        int max = primary.length;
        for (int i = 0; i < max - 1; i++) {
            for (int j = 0; j < max - i - 1; j++) {
                if (primary[j] > primary[j + 1]) {
                    // swapping
                    int temp = primary[j];
                    primary[j] = primary[j + 1];
                    primary[j + 1] = temp;
                }
            }
        }

        printSorted.print(primary);


        return primary;
    }
}
