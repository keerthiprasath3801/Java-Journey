package programs.strings;

import java.util.HashSet;

public class UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(hasAllUnique("apple"));  // false
        System.out.println(hasAllUnique("kite"));   // true
    }

    static boolean hasAllUnique(String str) {
        HashSet<Character> seen = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (seen.contains(c)) {
                return false;
            }
            seen.add(c);
        }
        return true;
    }
}

