package com.sparta.BubbleSort_Task_Test;
import com.sparta.g_BubbleSort_Task.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSortTest {

    @Test
    @DisplayName("Sort the Array {3, 7, 23, 4, 1, 11} using bubble sort")
    public void BubbleSortTest() {
        int[] test = {3, 7, 23, 4, 1, 11};
        int[] expectedSortedArray = test;
        Arrays.sort(expectedSortedArray);
        Assertions.assertEquals(Arrays.toString(expectedSortedArray), Arrays.toString(BubbleSort.sortArray(test)));

    }

}
