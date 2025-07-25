package com.basicProgram;

import java.util.Scanner;

public class StringFunctions {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name=in.next();
        String greeting=greet(name);
        System.out.println(greeting);
    }
    static String greet(String name){
        String message="Hello " +name;
        return message;
    }
}
