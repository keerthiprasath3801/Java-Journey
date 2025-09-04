package programs.strings;

public class Palindrome {
    public static void main(String[] args) {
        String s="Madam";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        String str = s.toLowerCase();
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
