package com.pattern;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int n= in.nextInt();
        for(int rows=1;rows <= n;rows++){
            for(int col=1;col<=rows;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
