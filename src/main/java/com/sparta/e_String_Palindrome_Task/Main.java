package com.sparta.e_String_Palindrome_Task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ask();
    }

    public static void ask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word for which you wish to test whether it is a palindrome: ");
        String result = scanner.next();
        lessThan3(result);

    }

    public static void lessThan3(String result) {
        if (result.length() < 3) {
            System.out.println("Please enter a word with 3 or more characters...");
            ask();
        } else {
            System.out.println(isPalindrome(result));
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



}
