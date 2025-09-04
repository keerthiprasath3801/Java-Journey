package programs.strings;

public class CountVowels {
    public static void main(String[] args) {
        String s="Hello world";
        count(s);
    }
    static void count(String s){
        String str=s.toLowerCase();
        int vowels=0;
        int consonants=0;
        int specialCharacaters=0;
       for(int i=0;i<str.length();i++){
           char c=str.charAt(i);
           if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
               vowels++;
           }else if(c>'a'&& c<'z'){
               consonants++;
           }else {
               specialCharacaters++;
           }
       }
        System.out.println(vowels);
        System.out.println(consonants);
        System.out.println(specialCharacaters);
    }
}
