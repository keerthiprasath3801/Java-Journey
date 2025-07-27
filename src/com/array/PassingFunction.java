package com.array;

import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        int[] arr={1,3,5,8,22};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr){
        arr[0]=3;
    }
}
