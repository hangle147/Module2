package demo;

import java.util.Scanner;

public class integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = sc.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int c = sc.nextInt();

        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.print("S lớn nhất trong ba số ");
        System.out.println(max);
    }
}
