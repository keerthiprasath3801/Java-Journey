package com.linearSearch;

public class Rotated {
    public static void main(String[] args) {
        int[] arr={4};
        int target=3;
        System.out.println(rotate(arr,target));
    }
    static int rotate(int[] arr,int target){
        if(arr.length==0){
            return 0;
        }
        for(int i=0;i < arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
