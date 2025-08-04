package com.recursion;

public class CountZeros {
    public static void main(String[] args) {
        int n = 1020400;
        System.out.println(countZero(n, 0)); // Output: 4
    }

    static int countZero(int n, int count) {
        if (n == 0) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            return countZero(n / 10, count + 1);
        } else {
            return countZero(n / 10, count);
        }
    }
}

