package programs.arrays;

public class RotatedSearch {
    public static void main(String[] args) {
        int[] arr={7,1,2,3,4,5,6};
        int target=5;
       int result=sort(arr,target);
        System.out.println(result);
    }
    static int sort(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[start]<arr[mid]){
                if(arr[start]<=target && target < arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(arr[mid]<=target && target<end){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
