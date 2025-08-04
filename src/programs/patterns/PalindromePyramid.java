package programs.patterns;

public class PalindromePyramid {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Print increasing numbers: 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print decreasing numbers: i-1 to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Move to the next line
            System.out.println();
        }
    }
}
