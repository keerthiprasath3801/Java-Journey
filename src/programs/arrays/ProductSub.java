package programs.arrays;

public class ProductSub {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, -2, 4};
        System.out.println("Maximum Product Subarray: " + maxProduct(nums1)); // Output: 6

        int[] nums2 = {-2, 3, -4};
        System.out.println("Maximum Product Subarray: " + maxProduct(nums2)); // Output: 24
    }

    static int maxProduct(int[] arr) {
        int maxProd = arr[0];   // max product ending here
        int minProd = arr[0];   // min product ending here
        int result = arr[0];    // global max

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];

            // if current number is negative, swap max and min
            if (current < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            // update max and min using previous values
            maxProd = Math.max(current, maxProd * current);
            minProd = Math.min(current, minProd * current);

            // update global result
            result = Math.max(result, maxProd);
        }

        return result;
    }
}
