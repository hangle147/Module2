package Debug;

import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();

        try {
            validateTriangle(a, b, c);
            System.out.println("Tam giác hợp lệ!");
        } catch (IllegalAccessError e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static void validateTriangle(double a, double b, double c){
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Các cạnh tam giác phải là số dương!");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Tổng của hai cạnh phải lớn hơn cạnh còn lại!");
        }
    }
}
