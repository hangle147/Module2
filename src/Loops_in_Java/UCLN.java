package Loops_in_Java;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, UCLN, tmp;

        System.out.print("Nhập số thứ nhất: ");
        num1 = sc.nextInt();

        System.out.print("Nhập số thứ 2: ");
        num2 = sc.nextInt();

        while (num2 != 0) {
            tmp = num2;
            num2 = num1 % num2;
            num1 = tmp;
        }
        UCLN = num1;

        System.out.print("UCLN là: " + UCLN);
    }
}
