package programs.strings;

public class Characters {
    public static void main(String[] args) {
        String s="Hello";
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }
        String s2="Sk";
        char[] ch=s2.toCharArray();
        for(char chars: ch){
            System.out.print(chars + " ");
        }
    }
}
