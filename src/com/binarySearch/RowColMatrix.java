package com.binarySearch;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr, 28)));
    }
    static int[] search(int[][] arr,int target){
        int row=0;
        int c=arr[0].length -1;
        while (row < arr.length && c >= 0){
            if(arr[row][c]==target){
                return new int[]{row,c};
            }
            if(arr[row][c] < target){//arr[row][c]=>arr[0][3]=>40 target : 28 40 is not less than 28 so it will decrease the column
                row++;
            }else {
                c--;//[c]=2
            }

        }
        return new int[]{-1,-1};
    }
}
