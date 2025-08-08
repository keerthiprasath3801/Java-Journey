package programs.twopointer;

public class AllSubstrings{
    public static void main(String[] args) {
        String s = "abc";
        printAllSubstrings(s);
    }

    static void printAllSubstrings(String s) {
        int n = s.length();

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                // Print substring from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(s.charAt(k));
                }
                System.out.println();
            }
        }
    }
}

