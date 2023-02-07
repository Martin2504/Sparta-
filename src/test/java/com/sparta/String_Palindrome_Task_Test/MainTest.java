package com.sparta.String_Palindrome_Task_Test;

import static com.sparta.e_String_Palindrome_Task.Main.isPalindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MainTest {

    @ParameterizedTest
    @DisplayName("Testing palindromes")
    @ValueSource(strings = {"abba", "woow", "deed"})
    public void nonPalindromeTest2(String word) {
        Boolean actual = isPalindrome(word);
        Assertions.assertEquals(true, actual);
    }

    @ParameterizedTest
    @DisplayName("Testing non palindromes")
    @ValueSource(strings = {"hello", "martin", "shelby", "january"})
    public void nonPalindromeTest(String word) {
        Boolean actual = isPalindrome(word);
        Assertions.assertFalse(actual);
    }

}
