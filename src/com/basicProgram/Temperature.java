package com.basicProgram;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Temp celsius : ");
        float tempC=input.nextFloat();
        float tempf=(tempC * 9/5) + 32;
        System.out.println("The Temp in farenheit : " + tempf);
    }
}
