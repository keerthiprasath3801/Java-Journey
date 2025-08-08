package programs.slidingwindow;

public class SubarrMax {
    public static void main(String[] args) {
        int[] arr={2, 1, 5, 1, 3, 2};
        int target=3;
        //System.out.print(bruteforce(arr,target));
        System.out.print(sliding(arr,target));
    }
    static int sliding(int[] arr,int k){
        int maxlength=0;
        int windowsize=0;
        for(int i =0;i <k;i++){
            windowsize=windowsize+arr[i];
        }
        maxlength=windowsize;
        for(int i=k;i < arr.length;i++){
                windowsize=windowsize+arr[i]-arr[i-k];
                if(windowsize>maxlength){
                    maxlength=windowsize;
                }
            }
        return maxlength;
    }

    static int bruteforce(int[] arr, int k){
        int max=0;
        for(int i=0;i<=arr.length-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum=sum+arr[j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
