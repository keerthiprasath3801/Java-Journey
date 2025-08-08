package programs.twopointer;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] result = mergeArrays(arr1, arr2);
        System.out.println("Merged Array: " + Arrays.toString(result));
    }

    static int[] mergeArrays(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] merged = new int[a.length + b.length];

        // Merge both arrays until one ends
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                merged[k] = a[i];
                i = i + 1;
            } else {
                merged[k] = b[j];
                j = j + 1;
            }
            k = k + 1;
        }

        // Copy remaining elements from arr1 if any
        while (i < a.length) {
            merged[k] = a[i];
            i = i + 1;
            k = k + 1;
        }

        // Copy remaining elements from arr2 if any
        while (j < b.length) {
            merged[k] = b[j];
            j = j + 1;
            k = k + 1;
        }

        return merged;
    }
}