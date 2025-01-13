package Introduction_to_Java;

import java.util.Scanner;

public class ReadNumToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên không âm (tối đa 3 chữ số): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Số được chọn vượt quá giới hạn cho phép");
        } else {
            System.out.println("Chữ: " + convertToWords(number));
        }
        scanner.close();
    }

    public static String convertToWords(int num) {
        if (num == 0) {
            return "không";
        }

        String[] ones = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String[] teens = {"mười", "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu", "mười bảy", "mười tám", "mười chín"};
        String[] tens = {"", "", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};

        StringBuilder words = new StringBuilder();

        if (num >= 100) {
            words.append(ones[num / 100]).append(" trăm");
            num %= 100;
            if (num > 0) {
                words.append(" ");
            }
        }

        if (num >= 20) {
            words.append(tens[num / 10]);
            num %= 10;
            if (num > 0) {
                words.append(" ").append(ones[num]);
            }
        } else if (num >= 10) {
            words.append(teens[num - 10]);
        } else if (num > 0) {
            words.append(ones[num]);
        }

        return words.toString();
    }
}

