package com.strings;

import java.util.Arrays;

public class Alphabets {
    public static void main(String[] args) {
        String alphabets="";
        for(int i =0;i < 26;i++){
            char ch=(char)('a'+i);
            alphabets=alphabets+ch+" ";

        }
        System.out.println(alphabets);
        System.out.println(alphabets.toUpperCase());
        System.out.println(Arrays.toString(alphabets.toCharArray()));
    }
}
