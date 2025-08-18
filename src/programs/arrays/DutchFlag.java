package programs.arrays;

import java.util.Arrays;

public class DutchFlag {
    public static void main(String[] args) {
        int[] arr={2,1,0,0,1,2};
        dutch(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void dutch(int[] arr){
        int start=0;int slide=0;int end=arr.length -1;
        while(slide<=end){
            if(arr[slide]==0){
                int temp=arr[start];
                arr[start]=arr[slide];
                arr[slide]=temp;
                slide++;
                start++;
            } else if (arr[slide]==1) {
                slide++;
            }else {
                int temp=arr[end];
                arr[end]=arr[slide];
                arr[slide]=temp;
                end--;
            }
        }
    }
}
