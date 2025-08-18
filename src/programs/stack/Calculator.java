package programs.stack;
import java.util.Stack;

public class Calculator{
    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        char operation = '+';
        s = s.replaceAll(" ", "");

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');
            }
            if (!Character.isDigit(ch) || i == s.length() - 1) {
                if (operation == '+') {
                    stack.push(currentNumber);
                } else if (operation == '-') {
                    stack.push(-currentNumber);
                } else if (operation == '*') {
                    stack.push(stack.pop() * currentNumber);
                } else if (operation == '/') {
                    stack.push(stack.pop() / currentNumber);
                }
                operation = ch;
                currentNumber = 0;
            }
        }

        int result = 0;
        for (int num : stack) {
            result += num;
        }
        return result;
    }

    public static void main(String[] args) {
        String expr1 = "3+2*2";
        String expr2 = " 3/2 ";
        String expr3 = " 3+5 / 2 ";
        System.out.println(calculate(expr1));  // 7
        System.out.println(calculate(expr2));  // 1
        System.out.println(calculate(expr3));  // 5
    }
}
