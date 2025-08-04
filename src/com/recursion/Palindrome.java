package com.recursion;

public class Palindrome {
    public static void main(String[] args) {
        int number = 12321;
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    static boolean isPalindrome(int n) {
        return n == reverse(n, 0);
    }

    // Recursive function to reverse a number
    static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        int rem = n % 10;
        return reverse(n / 10, rev * 10 + rem);
    }
}
