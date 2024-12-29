package demo;

import java.util.Scanner;

public class Caculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập lần lượt hai số cần tính: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("Chọn phép toán:");
        System.out.println("1. Cộng (+)");
        System.out.println("2. Trừ (-)");
        System.out.println("3. Nhân (*)");
        System.out.println("4. Chia (/)");
        System.out.print("Nhập lựa chọn: ");

        int choice = sc.nextInt();
        double result;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Kết quả: " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println("Kết quả: " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("Kết quả: " + result);
                break;

            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Kết quả: " + result);
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0!");
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                break;
        }
    }
}
