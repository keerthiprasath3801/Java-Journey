package programs.arrays;

public class Slidingsub {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int ans=sub(arr,k);
        int min=submin(arr,k);
        System.out.println("The min is : "+min);
        System.out.println(ans);
    }
    static int sub(int[] arr,int k){
        int windowSum=0;
        int maxSum=0;
        if( arr.length<k) return -1;
        for(int i=0;i<k;i++){
            windowSum=windowSum+arr[i];
        }
        maxSum=windowSum;

        for(int i=k;i< arr.length;i++){
            windowSum=windowSum+arr[i]-arr[i-k];
            maxSum=Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
    static int submin(int[] arr,int k){
        int windowSum=0;
        int minSum=0;
        if( arr.length<k) return -1;
        for(int i=0;i<k;i++){
            windowSum=windowSum+arr[i];
        }
        minSum=windowSum;

        for(int i=k;i< arr.length;i++){
            windowSum=windowSum+arr[i]-arr[i-k];
            minSum=Math.min(minSum,windowSum);
        }
        return minSum;
    }
}
