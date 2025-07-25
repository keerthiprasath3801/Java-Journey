package com.functions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=in.nextInt();
        boolean primeN0=isPrime(n);
        System.out.println(primeN0);
    }
    static boolean isPrime(int n){
        if(n < 1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c * c > n;
        /*this can be writen as
        if(c*c>n){
        return true;
    }
        return false;*/

    }
}
