package programs.arrays;

import java.util.HashMap;
import java.util.Map;

//use this for negative number includes
public class Longestsubnegative {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 1, 3, 2, 1};
        int k = 3;
        int result =sub(arr,k);
        System.out.println(result);
    }
    static int sub(int[]arr,int k){
        Map<Integer,Integer>map=new HashMap<>();
        int prefixSum=0;
        int maxlen=0;
        for(int i=0;i< arr.length;i++){
            prefixSum=prefixSum+arr[i];
            if(prefixSum==k){
                maxlen=i+1;
            }
            if(map.containsKey(prefixSum-k)){
                maxlen=Math.max(maxlen,i-map.get(prefixSum-k));
            }
            if(!map.containsKey(prefixSum)){
                map.put(prefixSum,i);
            }
        }
        return maxlen;
    }
}
