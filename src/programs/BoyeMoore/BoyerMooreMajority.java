package programs.BoyeMoore;

public class BoyerMooreMajority {
    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 3, 3, 5, 3};
        System.out.println("Majority Element: " + majorityElement(nums));
    }
    static int majorityElement(int[] nums) {
            int candidate = 0;
            int count = 0;
            // Phase 1: Find candidate
            for (int num : nums) {
                if (count == 0) {
                    candidate = num;
                }
                if (num == candidate) {
                    count++;
                } else {
                    count--;
                }
            }

            return candidate; // Guaranteed to be majority
        }


    }


