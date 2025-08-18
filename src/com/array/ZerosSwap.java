package com.array;

import java.util.Arrays;

public class ZerosSwap {
    public static void main(String[] args) {
        int[] arr = {1,0,0, 0};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        int n = arr.length;
        int count = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count--;
            }
        }

        while (count >= 0) {
            arr[count] = 0;
            count--;

        }
    }
}