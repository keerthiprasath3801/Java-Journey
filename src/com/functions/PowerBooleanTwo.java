package com.functions;

import java.util.Scanner;

public class PowerBooleanTwo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        boolean isTwo=isPower(n);
        System.out.println(isTwo);
    }
    static boolean isPower(int n){
        int base=2;
        if(n < 1){
            return false;
        }
        while (base <=n){
            if(base==n){
                return true;
            }
            base=base*2;
        }
        return false;
    }
}
