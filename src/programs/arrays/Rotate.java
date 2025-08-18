package programs.arrays;

import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number elements in array : ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in array : ");
        for(int i=0;i<n;i++){
            arr[i]= in.nextInt();
        }
        System.out.println("Enter the number of elements to rotate : ");
        int k= in.nextInt();
        k=k%n;
        reverse(arr,0,n-1);

        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        for(int num:arr){
            System.out.print(num + " ");
        }

    }
    static void reverse(int[] arr,int start,int end){
        while (start < end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
