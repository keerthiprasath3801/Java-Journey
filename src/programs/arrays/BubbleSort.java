package programs.arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={23,3,4,5,6,22,55,88};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){

        for(int i=0;i< arr.length;i++){
            for(int j=1;j<arr.length-i-1;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
