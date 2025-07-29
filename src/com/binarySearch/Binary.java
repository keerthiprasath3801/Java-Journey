package com.binarySearch;

import java.util.Scanner;

public class Binary {
    //basic binary search program in a sorted array
    public static void main(String[] args) {
        int[] arr={-2,-1,0,1,3,6,8,9,22,56};
        int[] arr1={98,55,44,33,22,20,13,12};
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the target number : ");
        int target= in.nextInt();
        System.out.print("Enter the target descending  number : ");
        int target1 = in.nextInt();
        //first execute
        System.out.println(descending(arr1,target1));
        //second execute
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int[] arr,int target){
        //return the index
        //return -1 if it does not exists
        int start=0;
        int end=arr.length -1;
        while(start <= end){
            int mid=start + (end - start)/2;
            if(target < arr[mid]){
                end=mid - 1;
            }else if(target > arr[mid]){
                start= mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int descending(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start <=end){
            int mid=start+(end - start)/2;
            if(target < arr[mid]){
                start=mid-1;
            } else if (target > arr[mid]) {
                end=mid -1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
