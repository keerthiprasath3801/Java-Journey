package com.recursion;

public class NumbersExample {
    public static void main(String[] args) {
        print(1);

    }
//    static void print(int n){
//        System.out.println(n);
//        print2(n);
//    }
//    static void print2(int n){
//        System.out.println(n);
//        print3(n);
//    }
//    static void print3(int n){
//        System.out.println(n);
//    }
    static void print(int n){
       if(n==5){
           return;
       }
        System.out.println(n);
       print(n+1);
    }
}
