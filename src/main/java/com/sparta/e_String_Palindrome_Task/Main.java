package com.sparta.e_String_Palindrome_Task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ask();
        System.out.println(longestPalindromeFinder("hello martin abba racecar reviver"));
    }

    public static void ask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word for which you wish to test whether it is a palindrome: ");
        String result = scanner.next();
        lessThan3(result);


    }

    public static boolean lessThan3(String result) {
        if (result.length() < 3) {
//            System.out.println("Please enter a word with 3 or more characters...");
//            ask();
            return true;
        } else {
//            System.out.println(isPalindrome(result));
//            System.out.println(isPalindromeAPI(result));
            return false;
        }

    }

    public static boolean isPalindrome(String result) {

        // This string will store the result back to front
        String reverse = "";

        for (int i = result.length() - 1; i >= 0; i--) {
            reverse = reverse + result.charAt(i);
        }

        if (result.equals(reverse)) {
            return true;
        } else {
            return false;
        }

    }

    // same solution as isPalindrome using the .reverse() method in the JavaAPI (preferred)
    public static boolean isPalindromeAPI (String result) {
        return result.equals(new StringBuilder(result).reverse().toString());
    }


    public static String longestPalindromeFinder(String result) {
        String longestPalindrome = " ";
        String equalPalindrome = "";
        String[] splitToArrayOfStrings = result.split(" ");

        for (String s : splitToArrayOfStrings) {
            if (!lessThan3(s)){
                if (isPalindromeAPI(s)) {
                    if (s.length() == longestPalindrome.length()) {
                        equalPalindrome = s;
                    } else if (s.length() > longestPalindrome.length()) {
                        longestPalindrome = s;
                    }
                }
            }
        }

        if (equalPalindrome.length() > 2) {
            return "Two palindromes of equal length: " + longestPalindrome + " and " + equalPalindrome;
        } else if (longestPalindrome.length() > 2) {
            return longestPalindrome;
        } else {
            return "no palindromes";
        }

    }

}
