package com.basicProgram;

import java.util.Scanner;

public class CharCheck {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a character ");
        char ch=in.next().trim().charAt(0);

        if(ch >='a' && ch<='z'){
            System.out.println("The character is lowercase");
        }else{
            System.out.println("The charcater is upperCase");
        }

    }
}
