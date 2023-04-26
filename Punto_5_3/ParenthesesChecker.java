package Punto_5_3;

import java.util.Scanner;

public class ParenthesesChecker {
    private static class Stack {
        private int[] arr;
        private int top;

        public Stack() {
            arr = new int[1000000];
            top = -1;
        }

        public void push(int x) {
            arr[++top] = x;
        }

        public int pop() {
            return arr[top--];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == arr.length - 1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Stack stack = new Stack();
        int position = 0;
        boolean error = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(i + 1);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    System.out.println(i + 1);
                    error = true;
                    break;
                } else {
                    int top = stack.pop();
                    if ((c == ')' && s.charAt(top - 1) != '(') ||
                            (c == ']' && s.charAt(top - 1) != '[') ||
                            (c == '}' && s.charAt(top - 1) != '{')) {
                        System.out.println(top);
                        error = true;
                        break;
                    }
                }
            }
        }

        if (!error && !stack.isEmpty()) {
            System.out.println(stack.pop());
            error = true;
        }

        if (!error) {
            System.out.println("YES");
        }
    }
}
