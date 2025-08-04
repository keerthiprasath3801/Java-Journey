package com.recursion;

public class Product_Of_Digits {
    public static void main(String[] args) {
        int n=13042;
        System.out.println(product(n));;
    }
    static int product(int n){
        if(n==0){
            return 1;
        }
        return (n%10)*product(n/10);
    }
}
