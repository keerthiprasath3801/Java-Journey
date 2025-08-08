package programs.strings;

public class Reveresed {
    public static void main(String[] args) {
        String str="Madam";
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        System.out.println(reversed);
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }
}
