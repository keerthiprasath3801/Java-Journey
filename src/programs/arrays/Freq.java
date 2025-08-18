package programs.arrays;

import java.util.*;

public class Freq {
    public static void main(String[] args) {
       int[] arr={1,4,4,8,8,0,2,3,9};
       Map<Integer,Integer> freq=new HashMap<>();
       for(int nums:arr){
           freq.put(nums,freq.getOrDefault(nums,0)+1);
       }
       boolean found=false;
       for(Map.Entry<Integer,Integer> entry: freq.entrySet()){
           if(entry.getValue()>1){
               System.out.print(entry.getKey() + " ");
               found=true;
           }
       }
        if(!found){
            System.out.println("No frequency found !! ");
        }
    }
}
