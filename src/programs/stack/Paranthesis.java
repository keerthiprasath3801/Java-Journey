package programs.stack;

import java.util.Stack;

/*
    Use a stack to keep track of opening brackets.
    When we see an opening bracket → push it.
    When we see a closing bracket:
      If stack is empty → not balanced.
      If top of stack matches the closing bracket type → pop it.
      Otherwise → not balanced.
    At the end → stack must be empty for balanced brackets.
 */
public class Paranthesis {
    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]}")); // true
       // System.out.println(isBalanced("{[(])}")); // false
        //System.out.println(isBalanced("((()))")); // true
    }
    static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Handle closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening
                }
                char top = stack.pop();//top is for previous one ch is present one
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false; // Mismatch
                }
            }
        }
        return stack.isEmpty(); // Balanced only if nothing left
    }

}
