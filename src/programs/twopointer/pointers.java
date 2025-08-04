package programs.twopointer;

import java.util.Arrays;

public class pointers {
    public static void main(String[] args) {
       int[] arr = {1, 2, 4, 5, 6, 8, 9};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(arr,target)));

    }
    public static int[] twoSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) return new int[]{arr[left],arr[right]};
            else if (sum < target) left++;
            else right--;
        }

        return new int[]{-1,-1};
    }

}
