package programs.arrays;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr={2, 4, 5, 7, 1};
        int[] prefixsum=prefix(arr);
        System.out.println(Arrays.toString(prefixsum));
        System.out.println(rangeSum(prefixsum,1,3));
    }
    static int[] prefix(int[] arr){
        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i< arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }
    static int rangeSum(int[] prefix,int start,int end){
        if(start==0) return end;
        return prefix[end]-prefix[start-1];
    }
}
