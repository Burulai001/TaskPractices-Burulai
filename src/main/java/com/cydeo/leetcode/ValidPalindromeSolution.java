package com.cydeo.leetcode;

public class ValidPalindromeSolution {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Do geese see God?"));
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
        System.out.println(isPalindrome("A brown fox jumping over"));
    }

    public static boolean isPalindrome(String s) {
        //Declare 2 pointer variables
        int start = 0;
        int end = s.length() - 1;

        //Run a loop
        while (start < end) {       //Do geese see God
                                    // s              e
            //If it is not a alphanumeric character, increment start count
            while (!Character.isLetterOrDigit(s.charAt(start)))
                start++;

            //If it is not a alphanumeric character, decrement end count
            while ( !Character.isLetterOrDigit(s.charAt(end)))
                end--;

            //If it is not equal, return false
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
                return false;

            start++;
            end--;
        }

        return true;
    }
}
/*
Question-2 Valid Palindrome
• Write a function that accepts a string and determines whether it is a palindrome, ignoring nonalphanumeric characters and case and returns true if it is palindrome.
• Please, use two pointer strategy (opposite direction).
• (A string is said to be palindrome if it reads the same backward as forward, after converting all uppercase
letters into lowercase letters and removing all non-alphanumeric characters)
Examples:
Input: Do geese see God? Output: True
Input: Was it a car or a cat I saw? Output: True
Input: A brown fox jumping over Output: False
 */