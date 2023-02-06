package com.sparta.FirstJavaLesson;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MainTest {

    @Test
    @DisplayName("My first test")
    public void firstTest() {
        Assertions.assertTrue(5 == 5);
    }

    @Test
    @DisplayName("Given a time of 21, the greeting method should return 'Good Evening!' ")
    public void given21_greeting_ReturnsGoodEvening() {
        int time = 21;
        String expectedGreeting = "Good Evening!";
        String result = Main.greeting(time);
        Assertions.assertEquals(expectedGreeting, result);
    }

    @Test
    @DisplayName("Testing the boundry")
    public void testingBoundry() {
        int time = 18;
        String expectedGreeting = "Good Afternoon!";
        String result = Main.greeting(time);
        Assertions.assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 8, 12})
    @DisplayName("Given a time between 0 and 12, greeting method returns 'Good Morning!' ")
    public void GivenTimeBetween0And12_Greeting_ReturnsGoodMorning(int time) {
        String expected = "Good Morning!";
        String result = Main.greeting(time);
        Assertions.assertEquals(expected, result);
    }


    @ParameterizedTest
    @ValueSource(ints = {34, -2, 152})
    @DisplayName("Given a value out of the bounds, greeting method returns null ")
    public void GivenOutOfBoundsValues_Greeting_ReturnsReEnterPrompt(int time) {
        String result = Main.greeting(time);
        Assertions.assertNull(result);

    }


}