package programs.patterns;

public class HourglassPattern {
    public static void main(String[] args) {
        int n = 5;

        // Top Half: Inverted Pyramid
        for (int i = 0; i < n; i++) {
            // Leading spaces
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom Half: Regular Pyramid
        for (int i = 1; i < n; i++) {
            // Leading spaces
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
