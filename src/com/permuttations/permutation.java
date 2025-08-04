package com.permuttations;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        per("","abc");
       ArrayList<String> ans= perlist("","abc");
        System.out.println(ans);
//        String s="Hello";
//        System.out.println(s.substring(0,0));
        System.out.println(permutationsCount("", "abcd"));
    }
    static void per(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i <=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            per(f+ch+s,up.substring(1));
        }
    }
    static ArrayList<String> perlist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        char ch=up.charAt(0);
        for(int i=0;i <=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
           ans.addAll( perlist(f+ch+s,up.substring(1)));
        }
        return ans;
    }
    static int permutationsCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationsCount(f + ch + s, up.substring(1));
        }
        return count;
    }

}
