package com.functions;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[]args){
        power();
    }
    static void power(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= in.nextInt();
        int base=2;
        int count=1;
        if(n < 1){
            System.out.print("Enter a valid number");
        }
        while(base <=n){
            if(base ==n){
                System.out.println("The given number is a power of 2 ");
                System.out.println("The base value of a given number is : 2");
                System.out.println("The power value of a number is "+count);
                return;
            }
            base=base*2;
            count++;
        }
        System.out.println("The given number is not a power of two");

    }
}
