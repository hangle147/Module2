package demo;

import java.util.Scanner;

public class MaxInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng cần tìm: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i, j, max = arr[0];

        System.out.print("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (j = 0; j < n; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng: " + max);
    }
}
