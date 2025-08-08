package programs.strings;

public class PalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));  // Output: "bab" or "aba"
    }

    static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            int len1 = expandFromCenter(s, i, i);     // Odd length palindrome
            int len2 = expandFromCenter(s, i, i + 1); // Even length palindrome
            int maxLen = Math.max(len1, len2);

            if (maxLen > end - start) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    // Expand around center indices left and right
    static int expandFromCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        // Length of palindrome is R - L - 1
        return R - L - 1;
    }
}

