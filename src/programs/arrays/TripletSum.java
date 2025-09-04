package programs.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TripletSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 6, -1, 0};
        int target = 6;
        Set<List<Integer>> result=triplet(arr,target);
        System.out.println(result);
    }
    static Set<List<Integer>> triplet(int[] arr,int target){
        Set<List<Integer>> ans=new HashSet<>();
        int n= arr.length;
        for(int i=0;i< n-2;i++){
            int start=i+1;
            int end=n-1;
            while (start<end){
                int sum=arr[i]+arr[end]+arr[start];
                if(sum==target){
                    ans.add(Arrays.asList(arr[i],arr[start],arr[end]));
                    start++;
                    end--;
                }else if(sum < target){
                    start++;
                }else{
                    end --;
                }

            }
        }
        return ans;
    }
}
