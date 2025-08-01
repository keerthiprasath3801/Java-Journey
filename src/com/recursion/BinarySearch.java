package com.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 8, 9, 22};
        int target = 22;

        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1; // target not found
        }

        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {
            return mid; // return the index
        }

        if (target < arr[mid]) {
            return search(arr, target, s, mid - 1); // search in left half
        }

        return search(arr, target, mid + 1, e); // search in right half
    }
}
