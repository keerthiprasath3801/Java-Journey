package com.array;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        arr[0]=1;
        arr[1]=22;
        arr[2]=3;
        arr[3]=55;
        arr[4]=99;
        System.out.print(arr[0]);
        for(int i=0;i < arr.length;i++){
            arr[i]= in.nextInt();
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
