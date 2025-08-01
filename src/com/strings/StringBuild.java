package com.strings;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(6, 11, " Java");
        sb.reverse();

        System.out.println(sb.toString());  // Output: avaJ ,olleH
    }
}

