package programs.arrays;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,8,9,9};
        int target=9;
        int first=firstOccurence(arr,target);
        int last=lastOccurence(arr,target);
        System.out.println("First Occurence : "+first +" Last Occurence : "+ last );
    }
    static int firstOccurence(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        int result=-1;
        while(start <= end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                result=mid;
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid -1;
            }
        }
        return result;
    }
    static int lastOccurence(int[] arr,int target ){
        int start=0;
        int end= arr.length-1;
        int result=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                result=mid;
                start=mid+1;
            } else if (arr[mid]<target) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return result;
    }
}
