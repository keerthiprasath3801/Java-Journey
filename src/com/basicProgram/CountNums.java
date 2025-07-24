package com.basicProgram;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        System.out.print("Enter the number you want to find Occurence : ");
        int occ= in.nextInt();
        int count=0;
        while(n > 0){
            int rem=n%10;
            if(rem == occ){
                count++;
            }
            n=n/10;
        }
        System.out.println("The number occurence is "+ count );
    }
}
