package Search_Algorithm;

import java.util.Scanner;

public class LongestStringSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();
        String longestString = getLongestSortedString(input);
        System.out.println("Chuỗi con có độ dài lớn nhất sắp xếp theo thứ tự là: " + longestString);
    }

    public static String getLongestSortedString(String input) {
        String longestString = "";
        String currentString = "";
        
        for (int i = 0; i < input.length(); i++) {
            if (i == 0 || input.charAt(i) >= input.charAt(i - 1)) {
                currentString += input.charAt(i);
            } else {
                if (currentString.length() > longestString.length()) {
                    longestString = currentString;
                }
                currentString = "" + input.charAt(i);
            }
        }
        
        if (currentString.length() > longestString.length()) {
            longestString = currentString;
        }

        return longestString;
    }
}
