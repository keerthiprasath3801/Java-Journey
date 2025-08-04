package programs.patterns;

public class HollowDiamond {
    public static void main(String[] args) {
        int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
