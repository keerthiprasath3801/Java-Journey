package com.linearSearch;

public class MaximumInTwoD {
    public static void main(String[] args) {
        int[][] arr={
                {34,55,66,88},
                {4,2,1,8,9},
                {77,88,99,242}
        };
        int maxVal=max(arr);
        System.out.print(maxVal);
    }
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int row=0;row < arr.length;row++){
            for(int col=0;col < arr[row].length;col++){
                if(arr[row][col] > max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
}
