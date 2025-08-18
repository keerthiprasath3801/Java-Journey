package com.strings;

import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        subseqRet("","abc");
        System.out.println(subseqRet("","abc"));
    }
    /*
    // This recursive function prints all possible subsequences of a given string.
// A subsequence is a sequence formed by deleting zero or more characters from the string
// without changing the order of the remaining characters.

void sub(String processed, String unprocessed) {
    // Base Case:
    // If the unprocessed string is empty, we have built a complete subsequence.
    // Print the processed part which now represents one subsequence.
    if (unprocessed.isEmpty()) {
        System.out.println(processed);
        return;
    }

    // Take the first character from the unprocessed string
    char ch = unprocessed.charAt(0);

    // Recursive Case 1: Include the current character in the processed string
    // Explore the path where we choose to include this character in our subsequence
    sub(processed + ch, unprocessed.substring(1));

    // Recursive Case 2: Exclude the current character from the processed string
    // Explore the path where we choose NOT to include this character in our subsequence
    sub(processed, unprocessed.substring(1));

    // At each character, we have two choices: include or exclude.
    // This leads to a binary tree of recursion calls:
    // For a string of length n, it generates 2^n subsequences in total.

    // Example for "abc":
    // sub("", "abc")
    // ├── sub("a", "bc")
    // │   ├── sub("ab", "c")
    // │   │   ├── sub("abc", "")
    // │   │   └── sub("ab", "")
    // │   └── sub("a", "c")
    // │       ├── sub("ac", "")
    // │       └── sub("a", "")
    // └── sub("", "bc")
    //     ├── sub("b", "c")
    //     │   ├── sub("bc", "")
    //     │   └── sub("b", "")
    //     └── sub("", "c")
    //         ├── sub("c", "")
    //         └── sub("", "")

    // Output: abc, ab, ac, a, bc, b, c, ""
}

     */
    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);

        subseq(p+ch,up.substring(1)); // explored fully first
        subseq(p,up.substring(1));// explored fully after the above is done
    }
    static ArrayList<String> subseqRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
         ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }

}
/*
Call: sub("", "abc")

Level 0:
        ""
        /   \
       a     ""         ← (Include 'a') and (Exclude 'a')

Level 1:
     "a"     ""
    /  \     /  \
  "ab" "a"  "b"  ""     ← Include/Exclude 'b'

Level 2:
 "ab" "a" "b" ""
 / \   / \ / \ / \
abc ab ac a bc b c "" ← Include/Exclude 'c'

Final Output (Leaf nodes):
→ abc
→ ab
→ ac
→ a
→ bc
→ b
→ c
→ ""
sub("", "abc")
|
|-- sub("a", "bc")       ← include 'a'
|   |
|   |-- sub("ab", "c")   ← include 'b'
|   |   |
|   |   |-- sub("abc", "")   ← include 'c' → prints "abc"
|   |   |
|   |   |-- sub("ab", "")    ← exclude 'c' → prints "ab"
|   |
|   |-- sub("a", "c")    ← exclude 'b'
|       |
|       |-- sub("ac", "")    ← include 'c' → prints "ac"
|       |-- sub("a", "")     ← exclude 'c' → prints "a"
|
|-- sub("", "bc")        ← exclude 'a'
    |
    |-- sub("b", "c")     ← include 'b'
    |   |
    |   |-- sub("bc", "")     ← include 'c' → prints "bc"
    |   |-- sub("b", "")      ← exclude 'c' → prints "b"
    |
    |-- sub("", "c")      ← exclude 'b'
        |
        |-- sub("c", "")      ← include 'c' → prints "c"
        |-- sub("", "")       ← exclude 'c' → prints ""

 */
