package programs.arrays;
//use this only for positive number
public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 1, 3, 2, 1};
        int k = 3;
        int sublen=length(arr,k);
        System.out.println(sublen);
    }
    static int length(int[] arr,int target){
        int n= arr.length;
        int start=0;
        int sum=0;
        int maxlen=0;
        for(int end=0;end<n;end++){
            sum=sum+arr[end];
            while(sum > target){
                sum=sum-arr[start];
                start++;
            }
            if(sum==target){
                maxlen=Math.max(maxlen,end-start+1);
            }
        }
        return maxlen;
    }
}
