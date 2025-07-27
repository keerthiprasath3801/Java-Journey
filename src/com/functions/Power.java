package com.functions;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a base number : ");
        double n=in.nextDouble();
        System.out.print("Enter a power of a number : ");
        double p=in.nextDouble();
        double pow=power(n,p);
        System.out.println(pow);

    }
    static double power(double n,double b){
        int count =1;
        double pow=1;
        double neg=b;
        if(b<0){
            b=-b;
        }
        while(count <=b){
            pow=pow*n;
            count++;
        }
        if(neg <0){
            pow=1/pow;
        }
        return pow;
    }
}
