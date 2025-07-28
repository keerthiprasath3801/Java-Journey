package com.basicProgram;

import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= in.nextInt();
        int pal=n;
        int ans=0;
        while(n > 0){
            int rem=n%10;
            ans= ans * 10+rem;
            n=n/10;
        }
        if(ans == pal){
            System.out.print("The number is palindrom");
        }else {
            System.out.print("The number is not palindrom ");
        }
    }
}
