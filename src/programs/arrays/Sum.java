package programs.arrays;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number of Elements : ");
        int n= in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i < n;i++){
            arr[i]=in.nextInt();
        }
        int sum=0;
        for(int i=0;i < n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
