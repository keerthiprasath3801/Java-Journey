package programs.slidingwindow;

public class SubarrMin {
    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,3};
        int target=7;
        System.out.println(brute(arr,target));;
    }
    static int brute(int[] nums, int target){

        int minLength = nums.length + 1; // "Impossible" value

        for (int start = 0; start < nums.length; start++) {
            int sum = 0;//declaring sum here because it resets sum=0;
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];
                if (sum >= target) {
                    minLength = Math.min(minLength, end - start + 1);
                    break; // No need to go further for this start
                }
            }
        }
        return minLength == nums.length + 1 ? 0 : minLength;
    }
}
