package programs.strings;

public class Reverse {
    public static void main(String[] args) {
        String s="Hello";
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i)+" ");
        }
        String s2="Zoho";
        StringBuilder rev=new StringBuilder();
        char[] ch=s2.toCharArray();
        for(int i= ch.length-1;i>=0;i--){
            rev.append(ch[i]);
        }
        System.out.println(" " + rev);
    }
}
