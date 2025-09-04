package programs.arrays;

import java.util.Arrays;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {5,1, 2, 3, 4, 6};
        int target = 6;
        int[]ans=pair(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] pair(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        while(start < end){
            if(arr[start]+arr[end]==target){
                return new int[]{arr[start],arr[end]};
            }else if(arr[start]+arr[end] < target){
                start++;
            }else {
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}
