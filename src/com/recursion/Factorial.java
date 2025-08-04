package com.recursion;

public class Factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.print(fact(5));
    }
    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return (n)*fact(n-1);
    }
}
