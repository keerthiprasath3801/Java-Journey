package com.array;

public class Min {
    public static void main(String[] args) {
        int[] arr={3,8,9,0,106,88,99};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int minVal=arr[0];
        for(int i=1;i<arr.length;i++){
            if( arr[i] < minVal){
                minVal=arr[i];
            }
        }
        return minVal;
    }
}
