package programs.arrays;

import java.util.HashMap;
import java.util.Map;

public class subarrayCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -1, 2};
        int k = 3;
        int counts=count(arr,k);
        System.out.println(counts);
    }
    static int count(int[] arr,int k){
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int prefixsum=0;
        int count=0;
        for(int nums :arr){
            prefixsum=prefixsum+nums;
            if(map.containsKey(prefixsum-k)){
                count=count+map.get(prefixsum-k);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}
