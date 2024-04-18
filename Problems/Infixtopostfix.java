package Problems;

import java.util.*;

class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int max) {
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        stackArray[++top] = j;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

class Inftopost {
    private StackX stack;

    public Inftopost(int s) {
        stack = new StackX(s);
    }

    public static int precedence(char n) {
        switch (n) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }

    public String Infixtopostfix(String prefix) {
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);

            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9') {
                postfix.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && (precedence(prefix.charAt(i)) < precedence(stack.peek())
                        || precedence(prefix.charAt(i)) == precedence(stack.peek()))) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }

        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();

    } 
}


public class Infixtopostfix {
    public static void main(String[] args) {
        String infixExpression = "a+b*c-d/e";
        Inftopost infixToPostfixConverter = new Inftopost(infixExpression.length());
        String postfixExpression = infixToPostfixConverter.Infixtopostfix(infixExpression);
        System.out.println("Infix Expression:" + infixExpression);
        System.out.println("Postfix Expression:" + postfixExpression);
    }
}
