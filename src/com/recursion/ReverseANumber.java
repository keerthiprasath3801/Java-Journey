package com.recursion;
public class ReverseANumber {
    public static void main(String[] args) {
        int n = 182;
        System.out.println(reverse(n, 0)); // Output: 281
    }

    static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        return reverse(n / 10, rev * 10 + n % 10);
    }
}

