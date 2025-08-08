package programs.slidingwindow;

import java.util.*;

public class SubstringsWithABC {
    public static int countSubstrings(String s) {
        int n = s.length();
        int left = 0;
        int total = 0;

        Map<Character, Integer> freq = new HashMap<>();

        for (int right = 0; right < n; right++) {
            // Add current character to the frequency map
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            // While we have all three characters, try to shrink the window
            while (freq.containsKey('a') && freq.containsKey('b') && freq.containsKey('c')) {
                // All substrings from current `right` to end will be valid
                total += n - right;

                // Remove the leftmost character
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                left++;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("abcba"));   // Output: 5
        System.out.println(countSubstrings("ccabcc"));  // Output: 8
    }
}

