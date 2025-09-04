package programs.strings;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounts {
    public static void main(String[] args) {
        String str = "hello";
        int[] freq = new int[256]; // for extended ASCII

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " -> " + freq[i]);
            }
        }
        String s2="Character";

        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +" : "+entry.getValue());
        }
    }

}

