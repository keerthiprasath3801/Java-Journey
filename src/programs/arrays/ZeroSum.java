package programs.arrays;

import java.util.HashMap;
import java.util.Map;

public class ZeroSum {
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        System.out.println(zero(arr));
    }
    static boolean zero(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        int prefix=0;
        for(int i=0;i < arr.length;i++){
            prefix=prefix+arr[i];
            if(prefix==0){
                return true;
            }
            if(map.containsKey(prefix)){
                return true;
            }

            map.put(prefix,i);
        }
        return false;
    }
}
