package programs.strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s="aaaaa";
        System.out.println(remove(s));;
        String dup=duplicates(s);
        System.out.println(dup);
    }
    static int remove(String s){
        boolean[] seen=new boolean[256];
        StringBuilder remove=new StringBuilder();
        for(int i=0;i < s.length();i++){
            char ch=s.charAt(i);
            if(!seen[ch]){
                remove.append(ch);
                seen[ch]=true;
            }
        }
        String remo= remove.toString();
        return remo.length();
    }
    static String duplicates(String s){
        Set<Character> seen=new HashSet<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!seen.contains(ch)){
                seen.add(ch);
                sb.append(ch);
            }
        }
        return  sb.toString();
    }

}
