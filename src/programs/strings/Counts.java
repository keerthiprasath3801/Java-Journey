package programs.strings;

public class Counts {
    public static void main(String[] args) {
        String input = "Hello@123 World!";
        int vowels=0;int consonants=0;int specialCharacters=0;int numbers=0;
        for(int i=0;i < input.length();i++){
            char ch=input.charAt(i);
           if((ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')||
                   (ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')){
               vowels++;
           } else if((ch>='a'&& ch <='z')|| (ch>='A'&&ch <='Z')){
               consonants++;
           }else if((ch>='0' && ch<='9')){
               numbers++;
           }else{
               specialCharacters++;
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
        System.out.println(numbers);
        System.out.println(specialCharacters);
    }
}
