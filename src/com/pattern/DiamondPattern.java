package com.pattern;

public class DiamondPattern {
    public static void main(String[] args) {
        int n=4;
        pattern1(n);
    }
    static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int s=0;s<n-row;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=n-1;row>=1;row--){
            for(int s=0;s<n-row;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
