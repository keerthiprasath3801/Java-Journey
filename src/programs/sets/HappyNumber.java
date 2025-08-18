package programs.sets;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    static boolean isHappy(int n){
        Set<Integer> seen=new HashSet<>();
        while (n!=1){
            if(seen.contains(n)){
                return false;
            }
            seen.add(n);
            n=nextNo(n);
        }
     return true;
    }
    static int nextNo(int n){
        int sum=0;
        while(n >0){
            int rem=n%10;
            sum+=rem*rem;
            n=n/10;
        }
        return sum;
    }

}
