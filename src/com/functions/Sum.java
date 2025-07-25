package com.functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        sum();
        int add=sum2();//return type int
        System.out.println(add);
    }
    static int sum2(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        int a=in.nextInt();
        System.out.print("Enter a number 2 : ");
        int b= in.nextInt();
        int total=a+b;
        return total;
    }

    static void sum(){//it has a return type as void
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        int a=in.nextInt();
        System.out.print("Enter a number 2 : ");
        int b= in.nextInt();
        int sum=a+b;
        System.out.println("The sum of two number is : "+sum);
    }
}
