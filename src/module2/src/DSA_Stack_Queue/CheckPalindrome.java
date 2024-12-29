package DSA_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checkPalindrome(input);

        // Hiển thị kết quả
        if (isPalindrome) {
            System.out.println("Chuỗi \"" + input + "\" là một chuỗi Palindrome.");
        } else {
            System.out.println("Chuỗi \"" + input + "\" không phải là một chuỗi Palindrome.");
        }

        scanner.close();
    }

    private static boolean checkPalindrome(String input) {
        String normalizedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char c : normalizedInput.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                return false;
            }
        }

        return true;
    }
}
