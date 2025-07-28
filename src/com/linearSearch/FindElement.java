package com.linearSearch;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args){
        int[] arr={22,44,1,5,7,99,44,55,22,66};
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int target=in.nextInt();
        int search=linear(arr,target);
        if(search !=-1){
            System.out.println("The element is found at the index is : "+search);
        }else{
            System.out.println("The element is not found ");
        }

    }
    static int linear(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i < arr.length;i++){
            if(arr[i]==target){
                System.out.println("The element is found : "+arr[i]);
                return i;
            }
        }
        return -1;
    }

}
