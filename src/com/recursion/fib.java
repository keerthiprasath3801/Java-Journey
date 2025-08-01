package com.recursion;

import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number ");
        int n= in.nextInt();
        System.out.println(fib(n));
    }
    static int fib(int n){
        if(n <2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
