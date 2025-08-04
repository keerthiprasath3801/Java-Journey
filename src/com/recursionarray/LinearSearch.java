package com.recursionarray;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,4,6,8,9,22};
        int target=9;
        System.out.println(find(arr,target,0));
        System.out.println(findIndex(arr,target,0));
    }
    static boolean find(int[]arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || find(arr,target,index+1);
    }
    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

}
