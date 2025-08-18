package programs.arrays;

public class Linear {
    public static void main(String[] args) {
        int[] arr={2,4,4,8,9,10};
        int target=8;
        boolean isfound=false;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                System.out.println( "Element found at "+ i +" index");
                isfound=true;
            }
        }
        if(!isfound){
            System.out.println("Not found ");
        }
    }
}
