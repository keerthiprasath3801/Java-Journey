package com.linearSearch;

import java.util.Scanner;

public class RangeSearch {
    public static void main(String[] args){
        int[] arr={44,22,3,4,88,99};
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the target number : ");
        int target= in.nextInt();
        System.out.print("Enter the starting index : ");
        int start=in.nextInt();
        System.out.print("Enter the ending index :  ");
        int end = in.nextInt();
        boolean range=rangeSearch(arr,target,start,end);
        System.out.println(range);
    }
    static boolean rangeSearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return false;
        }
        for(int i=start;i < end;i++){
            if (arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
