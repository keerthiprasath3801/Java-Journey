package com.strings;

public class SubsequenceRecursion {

    public static void main(String[] args) {
        String str = "abc";
        printSubsequences(str, 0, "");
    }

    static void printSubsequences(String str, int index, String current) {
        // Base case: when index goes out of bounds
        if (index == str.length()) {
            System.out.println( current );
            return;
        }

        // Include current character
        printSubsequences(str, index + 1, current + str.charAt(index));

        // Exclude current character
        printSubsequences(str, index + 1, current);
    }
}

