package programs.strings;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input = "swiss";
        char result = firstNonRepeatingChar(input);

        if (result != 0) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
    }

    static char firstNonRepeatingChar(String str) {
        int[] freq = new int[256]; // Frequency array for all ASCII chars

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return 0; // no non-repeating character found
    }
}

