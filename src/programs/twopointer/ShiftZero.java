package programs.twopointer;

import java.util.Arrays;

public class ShiftZero {
    public static void main(String[] args) {
        int[] arr = {1, 0, 6, 0, 0, 0};
        int[] changed = shiftZerosLeft(arr);
        System.out.println(Arrays.toString(changed));
    }

    static int[] shiftZerosLeft(int[] arr) {
        if (arr == null || arr.length == 0) return arr;

        int insertPos = arr.length - 1; // Start inserting non-zero elements from the end

        // First pass: Traverse from right to left and place non-zero elements at the current insertPos
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[insertPos] = arr[i];
                insertPos--; // Move to the left
            }
        }

        // Second pass: Fill the remaining positions on the left with 0s
        while (insertPos >= 0) {
            arr[insertPos] = 0;
            insertPos--;
        }

        return arr;
    }
}
