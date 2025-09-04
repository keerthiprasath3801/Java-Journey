package programs.arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        // Method 1: Get the new length
        int newLength = removeDuplicates(nums);

        // Method 2: Print the array without duplicates
        printArray(nums, newLength);

        // Print results
        System.out.println("New Length: " + newLength);
    }

    // Method 1: Removes duplicates and returns the new length
    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];  // overwrite duplicate with unique value
            }
        }
        return i + 1;  // new length
    }

    // Method 2: Prints the array up to the new length
    static void printArray(int[] nums, int length) {
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
