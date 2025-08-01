package com.pattern;

import java.util.Scanner;

public class MyPattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n= in.nextInt();
        for(int rows=1;rows<=n;rows++){
            for(int s=n;s>rows;s--){
                System.out.print(" ");
            }
            for(int col=1;col<=rows;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int rows=1;rows<=n;rows++){
            for(int s=1;s<=rows;s++){
                System.out.print(" ");
            }
            for(int col=n;col>rows;col--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
