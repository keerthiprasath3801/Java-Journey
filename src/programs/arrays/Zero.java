package programs.arrays;

import java.util.Arrays;

public class Zero {
    public static void main(String[] args) {
        int[] arr={1,3,5,0,11,9,0};
        int index=0;
        int zero= arr.length-1;
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }else{
                arr[zero]=0;
                zero--;
                count++;
            }
        }
        System.out.println(count);

//        while(index < arr.length){
//            arr[index]=0;
//            index++;
//        }
        System.out.println(Arrays.toString(arr));
        ZeroLast(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void ZeroLast(int[] arr){
        int index= arr.length - 1;

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index --;
            }
        }
        while(index >= 0){
            arr[index]=0;
            index--;
        }
    }
}
