package com.strings;

public class Palindrome {
    public static void main(String[] args) {
        String str="Madam";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(palindrom(str));
    }
    static boolean palindrom(String str){
        str=str.toLowerCase();
        for(int i=0;i < str.length()/2;i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length() -1 -i);
            if(start !=end){
                return false;
            }
        }
        return true;
    }
}
