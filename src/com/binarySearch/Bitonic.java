package com.binarySearch;

public class Bitonic {
    public static void main(String[] args) {
        int[] arr={1,3,8,13,15,3};

        System.out.println(bitonic(arr));
    }
    static int bitonic(int[] arr){

            for(int j=1;j< arr.length;j++){
                if(arr[j] <arr[j-1]){
                    return arr[j-1];
                }
            }


        return -1;
    }
}
