package com.basicProgram;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=in.nextInt();
        int base=2;
        int power=1;
        int powerValue=1;
        if(n <1){
            System.out.print("Enter a valid number");
            return;
        }
        while(base * power <=n){
            if(base * power ==n){
                System.out.println("The given number is power of 2");
                System.out.println("The Base of a no is 2"+" The power value of a number is "+ powerValue);
                return;
            }
            power=power*2;
            powerValue++;
        }
        System.out.println("The given number is not a power of 2");
    }

}
