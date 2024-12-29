package demo;

import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần chuyển đổi: ");
        String s = sc.nextLine();
        System.out.println("Chuỗi in hoa " + s.toUpperCase());
        System.out.println("Chuỗi thường: " + s.toLowerCase());
        int length = s.length();
        for (int i = length - 1; i >= 0; i--) {
            System.out.println("Chuỗi đảo ngược: ");
        }
    }
}
