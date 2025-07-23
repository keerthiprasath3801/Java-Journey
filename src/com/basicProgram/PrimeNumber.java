package com.basicProgram;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        int count=2;
        if(n <= 1){
            System.out.println("Neither prime nor Composite");
            return;
        }
        while(count*count <=n){
            if(n%count==0){
                System.out.println("The number is not prime");
                return;
            }
            count++;
        }
        if (count * count > n){
            System.out.println("The number is prime");
        }
    }
}
