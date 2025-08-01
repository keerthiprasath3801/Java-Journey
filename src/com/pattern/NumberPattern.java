package com.pattern;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n= in.nextInt();
        for(int rows=1;rows<=n;rows++){
            for(int cols=1;cols<=rows;cols++){
                System.out.print(cols);
            }
            System.out.println();
        }
    }
}
