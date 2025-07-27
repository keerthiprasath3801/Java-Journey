package com.array;

import java.util.Arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] arr={
            {1,5,7,8},
                {4,6,8,8,9},
                {6}
        };
        for(int row=0;row < arr.length;row++){
            for (int col=0; col <arr[row].length;col++){
               // System.out.print(arr[row][col]+" ");
            }
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
