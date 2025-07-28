package com.linearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args){
        int[]nums={2,7,11,15};
        Scanner in=new Scanner(System.in);
        int target=in.nextInt();
       int[] total= sum(nums,target);
        System.out.println(Arrays.toString(total));
    }
    static int[] sum(int[] nums ,int target){
        for(int i=0;i < nums.length;i++){
            for(int j=i+1;j < nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
