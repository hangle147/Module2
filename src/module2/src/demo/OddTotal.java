package demo;

import java.util.Scanner;

public class OddTotal {
    public static boolean checkNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng cần tìm: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i, j, sum = 0;

        System.out.print("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (j = 0; j < n; j++) {
            if (!checkNumber(arr[j])) {
                sum += arr[j];
            }
        }
        System.out.print("Tổng các phần tử là số lẻ: " + sum);
    }
}
