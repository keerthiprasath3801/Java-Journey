package programs.arrays;

import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int degree = 180;
        int times = (degree / 90) % 4;
        for (int i = 0; i < times; i++) {
            rotate(arr);
        }
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
    static void rotate(int[][] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
