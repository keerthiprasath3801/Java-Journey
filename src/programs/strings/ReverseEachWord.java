package programs.strings;

public class ReverseEachWord {
    public static void main(String[] args) {
        String sentence = "Hello World from Java";
        String result = reverseWords(sentence);
        System.out.println(result);
    }

    static String reverseWords(String sentence) {
        char[] chars = sentence.toCharArray();
        int n = chars.length;
        StringBuilder result = new StringBuilder(n);

        int wordStart = 0;
        for (int i = 0; i <= n; i++) {
            if (i == n || chars[i] == ' ') {
                // Reverse current word [wordStart, i-1]
                for (int j = i - 1; j >= wordStart; j--) {
                    result.append(chars[j]);
                }
                if (i != n) {
                    result.append(' ');
                }
                wordStart = i + 1;
            }
        }
        return result.toString();
    }
}
