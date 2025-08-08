package programs.strings;

public class StringCompressor {
    public static void main(String[] args) {
        String input = "aaabbc";
        System.out.println(compress(input));  // Output: a3b2c1
    }

    static String compress(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        char currentChar = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                // Append previous character and its count
                result.append(currentChar);
                result.append(count);

                // Reset for new character
                currentChar = s.charAt(i);
                count = 1;
            }
        }

        // Append last character and count
        result.append(currentChar);
        result.append(count);

        return result.toString();
    }
}

