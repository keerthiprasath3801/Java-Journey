package com.recursion;

public class Sum {
    public static void main(String[] args) {
        int n=5;
        System.out.println(Sum(n));
    }
    static int Sum(int n){
        if(n <= 0){
            return 0;
        }
        return n +Sum(n-1);
    }
}
