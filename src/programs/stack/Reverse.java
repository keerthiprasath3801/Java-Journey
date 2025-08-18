package programs.stack;

import java.util.Stack;

/*
    A stack works on LIFO (Last In, First Out) principle
    1.Push all characters of the string onto the stack.
    2.Pop them one by one — the order automatically reverses.
    Create an empty stack of characters.
    Traverse the string and push each character onto the stack.
    Pop characters from the stack and append to a new string.
    Return the reversed string.
 */
public class Reverse {
    public static void main(String[] args) {
        String input = "Hello";
        String output = reversed(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + output);
    }
    static String reversed(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i < s.length();i++){
            stack.push(s.charAt(i));
        }
        String reversed="";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return reversed;
    }
}
