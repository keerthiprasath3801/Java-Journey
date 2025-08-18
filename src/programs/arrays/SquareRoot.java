package programs.arrays;

public class SquareRoot {
    public static void main(String[] args) {
        int n=48;
        int ans=square(n);
        System.out.println(ans);
    }
    static int square(int n){
        int start=0;
        int end=n;
        int ans=-1;
        if(n==0 || n==1){
            return n;
        }
        while(start <= end){
            int mid=start+(end-start)/2;
            if((long)mid * mid==n){
                return mid;
            }
            if((long)mid *mid < n){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
}
