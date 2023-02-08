package com.sparta.String_Palindrome_Task_Test;

import static com.sparta.e_String_Palindrome_Task.Main.isPalindromeAPI;
import static com.sparta.e_String_Palindrome_Task.Main.longestPalindromeFinder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MainTest {

    @ParameterizedTest
    @DisplayName("Testing palindromes")
    @ValueSource(strings = {"abba", "woow", "deed"})
    public void nonPalindromeTest2(String word) {
        Boolean actual = isPalindromeAPI(word);
        Assertions.assertEquals(true, actual);
    }

    @ParameterizedTest
    @DisplayName("Testing non palindromes")
    @ValueSource(strings = {"hello", "martin", "shelby", "january"})
    public void nonPalindromeTest(String word) {
        Boolean actual = isPalindromeAPI(word);
        Assertions.assertFalse(actual);
    }

    @Test
    @DisplayName("Testing functionality of returning longest palindrome from a sentance")
    public void longestPalindromeTest() {
        String returned = longestPalindromeFinder("hello martin abba racecar");
        Assertions.assertEquals("racecar", returned);
    }

    @Test
    @DisplayName("Passing a sentence with no palindromes")
    public void noLongestPalindromeTest() {
        String returned = longestPalindromeFinder("hello how are you today");
        Assertions.assertEquals("no palindromes", returned);
    }

    @Test
    @DisplayName("Passing a sentence with two palindromes of equal length")
    public void twoLongestPalindromeTest() {
        String returned = longestPalindromeFinder("hello racecar reviver");
        Assertions.assertEquals("Two palindromes of equal length: racecar and reviver", returned);
    }

}
