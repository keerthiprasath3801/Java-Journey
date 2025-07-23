package com.firstProgram;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner inputs=new Scanner(System.in);
        //type casting
        int a=(int)(78.98);
        System.out.println(a);

        int b=257;
        byte c=(byte)(b);
        System.out.println(c);

        byte num1=40;
        byte num2=50;
        byte num3=100;
        int result=num1*num2/num3;
        System.out.println(result);
    }
}
