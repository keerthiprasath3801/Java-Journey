package com.basicProgram;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a base value : ");
        double base=in.nextDouble();// if i use int means its work for only whole numbers
        // if i use double means it work for all
        System.out.print("Enter a Power value : ");
        double power=in.nextDouble();
        double result=1;
        int count=0;
        while(count<power){
            result= result*base;
            count++;
        }
        System.out.println("The value is "+ result);
        double inbuild=Math.pow(base,power);
        System.out.println("The inbuild method value is : " + inbuild);
        //typecasting of power
        int typecast=(int)Math.pow(base,power);
        System.out.println("The typecaste value of power is "+ typecast);
    }
}
