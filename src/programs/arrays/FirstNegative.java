package programs.arrays;

import java.util.Arrays;

public class FirstNegative {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        negative(arr,k);

    }
    static void negative(int[] arr,int k){
        boolean found=false;
        for(int i=0;i<= arr.length-k;i++){
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    System.out.print(arr[j]+" ");
                    found =true;
                    break;
                }

            }
        }
        if(!found) System.out.println("0"+ ' ');;
    }
}
