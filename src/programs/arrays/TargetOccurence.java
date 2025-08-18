package programs.arrays;

public class TargetOccurence {
    public static void main(String[] args) {
        int[] arr={1,3,3,3,6,8,9};
        int target =3;
        int count=0;
        boolean isfound=false;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]==target){
                count++;
                isfound=true;
            }
        }
        if(!isfound){
            System.out.println("The element is not found ");
        }
        System.out.println(count);
    }
}
