package com.recursionarray;

public class sorted {
    public static void main(String[] args) {
        //check the array is sorted or not
        int[] arr={1,3,5,7,8};
        System.out.println(sort(arr,0));
    }
    static boolean sort(int[] arr,int i){
        if(i < arr.length){
            return true;
        }
        return arr[i]<arr[i+1] && sort(arr,i+1);
    }
}
