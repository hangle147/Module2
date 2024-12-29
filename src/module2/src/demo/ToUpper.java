package demo;

import java.util.Scanner;

public class ToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi ký tự cần chuyển đổi: ");
        String s = sc.nextLine();
        System.out.print("Chuỗi sau khi chuyển đổi: " + s.toUpperCase());
    }
}
