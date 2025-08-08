package programs.twopointer;

import java.util.HashSet;

public class SubString {
    public static void main(String[] args) {
        String input = "pk";
        String result = sub(input);
        System.out.println("Longest unique substring: " + result); // Output: "abc"
        System.out.println("Length: " + result.length());           // Output: 3
    }
    static String sub(String s){
        int start=0; int end=0; int maxlength=0;int maxStart = 0;
        HashSet<Character> set=new HashSet<>();
        while(end<s.length()){
            char ch=s.charAt(end);
            if(!set.contains(ch)){
                set.add(ch);
                end++;
               // maxlength=Math.max(maxlength,end-start);
                if (end - start > maxlength) {
                    maxlength = end - start;
                    maxStart = start;
                }
            }else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return s.substring(maxStart,maxlength);
    }
}
