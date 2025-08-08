package programs.slidingwindow;

import java.util.*;

public class BinarSum {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1); // base case

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;
            // Check if (sum - goal) has occurred before
            if (prefixCount.containsKey(sum - goal)) {
                count += prefixCount.get(sum - goal);
            }
            // Add current prefix sum to the map
            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 0, 1, 0, 0, 1};
        System.out.println(numSubarraysWithSum(nums1, 3)); // Output: 4

        int[] nums2 = {0, 0, 0, 0, 1};
        System.out.println(numSubarraysWithSum(nums2, 0)); // Output: 10
    }
}

