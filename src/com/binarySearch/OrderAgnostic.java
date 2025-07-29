package com.binarySearch;

import java.util.Scanner;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr={2,3,6,8,9,11,21,33,55,77,88,99};
        System.out.print("Enter the target number : ");
        Scanner in = new Scanner(System.in);
        int target =in.nextInt();
        System.out.println(order(arr,target));
    }
    static int order(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAscec=arr[start] < arr[end];
        while(start <=end){
            int mid=start+(end-start)/2;
            if(arr[mid] ==target){
                return mid;
            }
            if(isAscec){
                if(target < arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else {
                if(target > arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
