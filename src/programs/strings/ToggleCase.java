package programs.strings;

public class ToggleCase {
    public static void main(String[] args) {
        String input = "HeLLo pt";
        System.out.println(toggleCase(input));  // Output: hEllO
    }

    static String toggleCase(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];

            if (ch >= 'A' && ch <= 'Z') {
                // Convert uppercase to lowercase
                chars[i] = (char)(ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase to uppercase
                chars[i] = (char)(ch - 32);
            }else{
                chars[i]=' ';
            }
        }

        return new String(chars);
    }
}

