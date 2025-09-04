package programs.patterns;

public class DirectionCalculation {
    public static void main(String[] args) {
        int n = 5; // number of rows

        for (int i = 1; i <= n; i++) {
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += (n - j); // increment along the diagonal
            }
            System.out.println();
        }
    }
}
