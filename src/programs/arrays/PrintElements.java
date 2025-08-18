package programs.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class PrintElements {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of elements in array : ");
        int n= in.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements in array : ");
        for(int i=0 ; i< n;i++){
            arr[i]= in.nextInt();
        }
        System.out.println("The Elements of array are : ");
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
        System.out.println(Arrays.toString(arr));
    }
}
