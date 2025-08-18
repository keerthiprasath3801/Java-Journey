package programs.arrays;

public class Binary {
    public static void main(String[] args) {
        int[] arr={2,7,8,9,44,77,88};
        int target =9;
        int index=binary(arr,target);
        System.out.println(index);
    }
    static int binary(int[] arr,int target){
        int start=0;
        int end= arr.length - 1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                System.out.print("Target found in index ");
                return mid;
            } else if (arr[mid]<target) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
