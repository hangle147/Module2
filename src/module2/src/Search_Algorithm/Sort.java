package Search_Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi: ");
        String input = scanner.nextLine();
        String sortedString = getSortedString(input);
        System.out.println("Chuỗi con sắp xếp từ bé đến lớn: " + sortedString);
    }

    public static String getSortedString(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
