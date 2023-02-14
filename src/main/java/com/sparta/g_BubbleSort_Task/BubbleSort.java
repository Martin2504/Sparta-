package com.sparta.g_BubbleSort_Task;

import com.sparta.l_Logging.Main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BubbleSort {
    public static final Logger logger = Logger.getLogger(BubbleSort.class.getName());     // create logger
    public static int[] sortArray(int[] intArray) {
        logger.log(Level.INFO, "Method has started");
        int arrayLength = intArray.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            logger.log(Level.FINE, "Outer loop started");
            logger.log(Level.FINE, "Value of i: " + i);
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
