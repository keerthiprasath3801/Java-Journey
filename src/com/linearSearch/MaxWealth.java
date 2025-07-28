package com.linearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts={
                {1,2,3},{3,2,11}
        };
        System.out.println(maxwealth(accounts));
    }
    static int maxwealth(int[][] accounts){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i < accounts.length;i++){
            int sum=0;
            for(int j=0;j < accounts[i].length;j++){
                sum +=accounts[i][j];
            }
            if(sum > ans){
                ans=sum;
            }
        }
        return ans;
    }
}
