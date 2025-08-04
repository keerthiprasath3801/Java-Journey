package com.strings;

public class RemoveLetters {
    public static void main(String[] args) {
        System.out.println(reverse("","bcacad"));
    }
    static boolean reverse(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return false;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return reverse(p,up.substring(1));
        }else {
            return reverse(p+ch,up.substring(1));
        }

    }
}
