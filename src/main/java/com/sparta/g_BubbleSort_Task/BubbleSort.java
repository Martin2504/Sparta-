package com.sparta.g_BubbleSort_Task;

public class BubbleSort {
    public static int[] sortArray(int[] intArray) {
        int arrayLength = intArray.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 0; j < arrayLength - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    // swapping
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }

        ArrayPrinter.printArray(intArray);

        return intArray;
    }
}
