package com.linearSearch;

public class Mountain {
    public static void main(String[] args) {
        int[] arr={0,3,1,0};

        System.out.println(mountain(arr));
    }
    static int mountain(int[] arr){

        for(int i=0;i < arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    return i;
                }
        }
        return -1;
    }
}
