package DSA_Stack_Queue.ReverseTheElement;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello world this is Java";

        System.out.println("Chuỗi ban đầu:");
        System.out.println(input);

        Stack<String> stack = new Stack<>();

        String[] words = input.split(" ");
        for (String word : words) {
            stack.push(word);
        }

        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop()).append(" ");
        }

        System.out.println("Chuỗi sau khi đảo ngược:");
        System.out.println(reversedString.toString().trim());
    }
}
