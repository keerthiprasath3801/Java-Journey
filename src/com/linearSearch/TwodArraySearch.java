package com.linearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class TwodArraySearch {
    public static void main(String[] args) {
        int[][] arr = {
                {22, 55, 33, 77, 88},
                {3, 4, 6},
                {66, 44, 77, 88},
                {77, 77, 33}
        };
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int target = in.nextInt();
        int[] ans = twoarray(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] twoarray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}