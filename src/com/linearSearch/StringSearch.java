package com.linearSearch;

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the word : ");
        String word=in.next();
        System.out.print("Enter a letter : ");
        char letter=in.next().charAt(0);
        boolean out=stringSearch(word,letter);
        System.out.println(out);
    }
    static boolean stringSearch(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
