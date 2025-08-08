package programs.strings;

public class Palindrome {
    public static void main(String[] args) {
        String s="Madam";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        String str=s.toLowerCase();
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

}
