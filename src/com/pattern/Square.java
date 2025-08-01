package com.pattern;

public class Square {
    public static void main(String[] args) {
        int n = 4; // The maximum number to print at the boundary
        pattern31(n); // Call the function to print the pattern

        // Just a debug print to show how Math.min works
        System.out.println(Math.min(4, 8)); // This will print 4
    }

    static void pattern31(int n) {
        // Total number of rows/columns in the pattern
        // For n = 4, size = 2 * 4 - 1 = 7
        int size = 2 * n - 1;

        // Loop over each row
        for (int row = 0; row < size; row++) {
            // Loop over each column
            for (int col = 0; col < size; col++) {
                //for next row is 1 col is 0 here the minimum is 0 so it always print 4
                /*
                 * The idea is to find how far this current position (row, col)
                 * is from the nearest edge (top, left, bottom, right)
                 *
                 * Example:
                 * - top distance: row
                 * - left distance: col
                 * - bottom distance: size - 1 - row
                 * - right distance: size - 1 - col
                 *
                 * We take the minimum of these four to get the "layer" we're in.
                 */
                int minDist = Math.min(
                        Math.min(row, col),
                        Math.min(size - 1 - row, size - 1 - col)
                );

                // Subtract minDist from n to get the number for this layer
                // Outermost layer has distance 0 → n - 0 = 4
                // Next layer has distance 1 → n - 1 = 3, and so on
                System.out.print((n - minDist) + " ");
            }
            // New line after each row
            System.out.println();
        }
    }
}
