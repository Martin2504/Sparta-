package com.sparta.String_Palindrome_Task_Test;

import static com.sparta.e_String_Palindrome_Task.Main.isPalindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;




public class MainTest {

    @Test
    @DisplayName("Testing a palindrome")
    public void palindromeTest() {
        Assertions.assertEquals(true, isPalindrome("abba"));
    }


    @Test
    @DisplayName("Testing non palindrome")
    public void nonPalindromeTest() {
        Assertions.assertEquals(false, isPalindrome("hello"));
    }

}
