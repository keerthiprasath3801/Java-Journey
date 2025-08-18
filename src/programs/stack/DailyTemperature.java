package programs.stack;
/*
Problem Statement
Given an array temperatures representing daily temperatures, return an array answer such that answer[i]
is the number of days you have to wait after the ith day to get a warmer temperature.
If there is no future day for which this is possible, put 0 instead.

Input: temperatures = [73,74,75,71,69,72,76,73]
Output:       [1, 1, 4, 2, 1, 1, 0, 0]

Approach (Using Stack):
Use a stack to store indices of days.

For each day i, pop from the stack while the current temperature is warmer than the temperature at the top of the stack.

For each popped index, the answer is i - poppedIndex.

Push current day index onto the stack.
 */
import java.util.Stack;
import java.util.Arrays;
public class DailyTemperature {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();  // stores indices
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] temps = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(temps);
        System.out.println(Arrays.toString(result));
    }
}

