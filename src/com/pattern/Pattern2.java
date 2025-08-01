package com.pattern;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n= in.nextInt();
        for(int rows=1;rows<=n;rows++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
