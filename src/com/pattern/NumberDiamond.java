package com.pattern;

public class NumberDiamond {
    public static void main(String[] args) {
        int n=4;
        diamond(n);
    }
    static void diamond(int n){
        for(int rows=1;rows<=n;rows++){
            for(int s=0;s < n - rows;s++){
                System.out.print(" ");
            }
            for (int col=1;col<=rows;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        for(int rows=n-1;rows>=1;rows--){
            for(int s=0;s < n - rows;s++){
                System.out.print(" ");
            }
            for (int col=1;col<=rows;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
