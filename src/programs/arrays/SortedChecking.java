package programs.arrays;

import java.util.Scanner;

public class SortedChecking {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements in array : ");
        int n= in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+ n +" Elements ");
        for(int i=0;i<n;i++){
            arr[i]= in.nextInt();
        }
        boolean isSorted=true;//assuming the array is sorted
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        System.out.println(isSorted);

    }
}
