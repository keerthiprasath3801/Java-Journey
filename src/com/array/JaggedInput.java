package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedInput {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the no of rows : ");
        int rows = in.nextInt();
        int[][] arr=new int[rows][];

        for(int i = 0 ; i < rows;i++){
            System.out.print("Enter the no of columns in "+i+":");
            int col=in.nextInt();
            arr[i]=new int[col];
            for (int j=0;j < col;j++){
                arr[i][j]=in.nextInt();
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(Arrays.deepToString(arr));// if use arrays.tostring it prints only address
    }
}
