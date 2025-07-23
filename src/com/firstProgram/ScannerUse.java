package com.firstProgram;

import java.util.Scanner;

public class ScannerUse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(input.nextInt());
        System.out.println("Enter a string");
        System.out.println(input.next());
        input.nextLine();
        System.out.println("multiple lines to print use nextLine");
        System.out.println(input.nextLine());
    }
}
