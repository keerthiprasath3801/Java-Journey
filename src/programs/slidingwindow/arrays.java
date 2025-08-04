package programs.slidingwindow;

public class arrays {
    public int maxSum(int[] arr, int k) {
        if (arr.length < k || k <= 0) {
            return 0; // or throw an exception, depending on requirements
        }

        int windowSum = 0;
        // Compute the first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        return maxSum;
    }
}
