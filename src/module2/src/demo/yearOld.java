package demo;

import java.util.Scanner;

public class yearOld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập năm sinh: ");
        int yearOfBirth = sc.nextInt();
        final int year = 2024;
        int age = year - yearOfBirth;
        System.out.print("Tuổi hiện tại: " + age);
    }
}
