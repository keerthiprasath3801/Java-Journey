package com.functions;

import java.util.Scanner;

public class Square {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= in.nextInt();
        int val=square(n);
        System.out.print(val);

    }
    static int square(int n){
        int count=n*n;
        return count;
    }
}
