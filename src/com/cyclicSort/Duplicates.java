package com.cyclicSort;

public class Duplicates {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                if (i != correct) {
                    return nums[i];
                } else {
                    i++;
                }
            }
        }
        return -1;
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
