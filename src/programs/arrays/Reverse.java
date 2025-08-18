package programs.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of arrays : ");
        int n= in.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the array numbers : ");
        for(int i=0;i< n;i++){
            arr[i]=in.nextInt();
        }
        int start=0;
        int end=n - 1;
        while(start < end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
//       for(int i=0;i <n;i++){
//           System.out.print(arr[i]+" ");
//       }
        System.out.println(Arrays.toString(arr));
    }
}
