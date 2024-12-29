package DSA_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class ConversionDecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thập phân: ");
        int decimal = scanner.nextInt();

        String binary = decimalToBinary(decimal);

        System.out.println("Số nhị phân: " + binary);

        scanner.close();
    }

    private static String decimalToBinary(int decimal) {
        Stack<Integer> stack = new Stack<>();

        while (decimal > 0) {
            stack.push(decimal % 2);
            decimal /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.length() > 0 ? binary.toString() : "0";
    }
}
