package com.basicProgram;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=in.nextInt();
        int count =1;
        if(n < 1){
            System.out.println("Not a perfect Squares");
            return;
        }
        while(count * count <=n){
            if(count*count ==n){
                System.out.print("The Given Number is perfect square");
                return;

            }
            count++;
        }
        System.out.print("The given number is not a perfect square");
    }
}
//git pull origin main --rebase
//git push origin main