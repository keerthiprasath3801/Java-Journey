package com.array;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
     int[] arr={2,8,9,5,99};
     swap(arr,1,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
