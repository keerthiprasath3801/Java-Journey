package programs.arrays;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Length of the array : ");
        int n= in.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter "+n+" elements : ");
        for(int i=0;i<n;i++){
            arr[i]= in.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The maximum element is : "+max);
        System.out.println("The minimum element is : "+ min);

    }
}
