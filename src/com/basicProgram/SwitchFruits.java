package com.basicProgram;

import java.util.Scanner;

public class SwitchFruits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the fruits name : ");
        String fruits=in.next();
        switch (fruits){//press alt+ enter for enhanced switch
            case "Mango":
                System.out.println("It is a queen of fruits");
                break;
            case "Apple":
                System.out.println("Its a red fruit");
                break;
            case "Grapes":
                System.out.println("It is a purple fruit");
                break;
            case "Avacado":
                System.out.println("My favourite fruit");
                break;
            default:
                System.out.println("Enter a valid fruit");
        }
    }
}
