package StackAndQuesues.questions;

import java.util.Stack;

public class ValidParathesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false; // Ensure stack is not empty before popping
                }
                if (ch == ')' && stack.pop() != '(') {
                    return false;
                }
                if (ch == '}' && stack.pop() != '{') {
                    return false;
                }
                if (ch == ']' && stack.pop() != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
