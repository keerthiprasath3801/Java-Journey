package com.bubbleSort;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr={4,4,5,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){//it returns void because it does not change the array
        boolean swapped;
        for(int i=0;i < arr.length;i++){//this counter only not related with array it just increases
            swapped =false;
            for(int j=1;j < arr.length-i;j++){//its works with array
               if(arr[j] < arr[j-1]){// If the current element is SMALLER than the previous one, swap them
                   int temp=arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
                   swapped=true;
               }
            }
            if(!swapped){
                break;
            }
        }

    }
}
