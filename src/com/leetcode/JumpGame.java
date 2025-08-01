package com.leetcode;
//https://leetcode.com/problems/jump-game-ii/description/
public class JumpGame {
    public static void main(String[] args) {
        int [] arr={2,3,1,1,4};
        System.out.println(jump(arr));
    }
    static int jump(int[] nums){
        int jumps = 0;           // number of jumps made
        int next = 0;        // farthest index we can reach
        int currentEnd = 0;      // end of the range for current jump

        for (int i = 0; i < nums.length - 1; i++) {
            // Update the farthest we can reach from current position
            if (i + nums[i] > next) {
                next = i + nums[i];
            }

            // If we've reached the end of current jump range
            if (i == currentEnd) {
                jumps++;               // We make a jump
                currentEnd = next; // Set new range end
            }
        }

        return jumps;
    }
}
