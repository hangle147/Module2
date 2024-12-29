package DSA_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class CheckTheBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập biểu thức cần kiểm tra: ");
        String expression = scanner.nextLine();

        boolean isBalanced = checkBrackets(expression);

        if (isBalanced) {
            System.out.println("Biểu thức \"" + expression + "\" sử dụng dấu ngoặc hợp lệ.");
        } else {
            System.out.println("Biểu thức \"" + expression + "\" sử dụng dấu ngoặc không hợp lệ.");
        }

        scanner.close();
    }

    private static boolean checkBrackets(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char sym : expression.toCharArray()) {
            if (sym == '(' || sym == '[' || sym == '{') {
                stack.push(sym);
            }

            else if (sym == ')' || sym == ']' || sym == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char left = stack.pop();

                if (!isMatchingPair(left, sym)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char left, char right) {
        return (left == '(' && right == ')') ||
                (left == '[' && right == ']') ||
                (left == '{' && right == '}');
    }
}
