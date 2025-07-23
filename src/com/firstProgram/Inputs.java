package com.firstProgram;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner inputs=new Scanner(System.in);
        System.out.print("Enter the roll Number : ");
        int roll=inputs.nextInt();
        System.out.println("The roll Number is : " +roll );
        inputs.nextLine();
        System.out.print("Enter your name : ");
        String name=inputs.nextLine();
        System.out.println("The name is : " + name);
    }

}
