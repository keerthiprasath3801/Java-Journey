package com.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n=12345;
        System.out.print(Sum(n));
    }
    static int Sum(int n){
        if(n==0){
            return 0;
        }
        //To avoid infinite recursion, you must always call the
        // function with a smaller version of the input that eventually reaches the base case
        return (n%10)+Sum(n/10);
    }
}
/*
+-----------------------------+
| Sum(12345) → 5 + Sum(1234) |
+-----------------------------+
                      ↓
        +-----------------------------+
        | Sum(1234) → 4 + Sum(123)   |
        +-----------------------------+
                            ↓
              +-----------------------------+
              | Sum(123) → 3 + Sum(12)     |
              +-----------------------------+
                                  ↓
                    +-----------------------------+
                    | Sum(12) → 2 + Sum(1)        |
                    +-----------------------------+
                                        ↓
                          +-----------------------------+
                          | Sum(1) → 1 + Sum(0)         |
                          +-----------------------------+
                                              ↓
                                +---------------------+
                                | Sum(0) → 0          | ← base case
                                +---------------------+


 */
/*
| Function Call | `n % 10` | `n / 10` | Return Expression               |
| ------------- | -------- | -------- | ------------------------------- |
| `Sum(12345)`  | 5        | 1234     | `5 + Sum(1234)`                 |
| `Sum(1234)`   | 4        | 123      | `4 + Sum(123)`                  |
| `Sum(123)`    | 3        | 12       | `3 + Sum(12)`                   |
| `Sum(12)`     | 2        | 1        | `2 + Sum(1)`                    |
| `Sum(1)`      | 1        | 0        | `1 + Sum(0)`                    |
| `Sum(0)`      |          |          | returns `0` (base case reached) |
Sum(0)    → 0
Sum(1)    → 1 + 0 = 1
Sum(12)   → 2 + 1 = 3
Sum(123)  → 3 + 3 = 6
Sum(1234) → 4 + 6 = 10
Sum(12345)→ 5 + 10 = 15

 */