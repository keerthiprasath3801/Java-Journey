package programs.arrays;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements in array : ");
        int n= in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++){
            arr[i]= in.nextInt();
        }
        System.out.println("Enter the target element : ");
        int target= in.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(target==arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
