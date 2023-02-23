package com.sparta.TDD_Lesson_Test;

import com.sparta.p_TDD_Lesson.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    @DisplayName("Given one as input for max, return one as a String")
    public void givenOneReturnOneTest(){
        assertEquals("1", FizzBuzz.fizzBuzz(1));
    }

    @ParameterizedTest
    @CsvSource(value = {"1, 1", "2, 2"})
    @DisplayName("Given a number return it as a string")
    public void givenNumberReturnAsString(int input, String expected){
        assertEquals(expected, FizzBuzz.fizzBuzz(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"3, 3", "6, 6", "9, 9"})
    @DisplayName("Given a multiple of 3 return fizz")
    public void givenMultipleOfThreeReturnFizz(int input, String expected){
        assertEquals("fizz", FizzBuzz.fizzBuzz(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"5, 5", "10, 10", "25, 25"})
    @DisplayName("Given a multiple of 5 return buzz")
    public void givenMultipleOfFiveReturnBuzz(int input, String expected){
        assertEquals("buzz", FizzBuzz.fizzBuzz(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"15, 15", "30, 30", "45, 45"})
    @DisplayName("Given a multiple of 3 and 5 return buzz")
    public void givenMultipleOfThreeAndFiveReturnFizzBuzz(int input, String expected){
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(input));
    }

}