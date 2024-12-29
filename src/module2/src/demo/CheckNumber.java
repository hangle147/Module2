package demo;

import java.util.Scanner;

public class CheckNumber {
    public static boolean checkNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Nhập một số nguyên (>= 0): ");
            number = sc.nextInt();
        } while (number < 0);

        if (number == 0) {
            System.out.println("Số vừa nhập là số 0");
        } else if (checkNumber(number)) {
            System.out.println("Số vừa nhập là số chẵn");
        } else {
            System.out.println("Số vừa nhập là số lẻ");
        }
    }
}
