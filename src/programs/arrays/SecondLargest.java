package programs.arrays;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number of elements : ");
        int n= in.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements in array : ");
        for(int i=0;i<n;i++){
            arr[i]= in.nextInt();
        }
        int largest= Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]> largest){
                second=largest;
                largest=arr[i];
            } else if (arr[i]>second && arr[i] !=largest) {
                second=arr[i];
            }
        }
        if (second==Integer.MIN_VALUE){
            System.out.println("No second largest element");
        }else{
            System.out.println("The second largest element in a array : "+second);
        }
    }
}
