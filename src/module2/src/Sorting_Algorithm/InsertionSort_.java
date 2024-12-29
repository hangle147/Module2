package Sorting_Algorithm;

import java.util.Scanner;

public class InsertionSort_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] list = new int[n];

        System.out.println("Nhập các phần tử trong mảng: ");
        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.print("Mảng ban đầu: ");
        printArray(list);

        insertionSort(list);

        System.out.print("Mảng sau khi sắp xếp: ");
        printArray(list);
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = key;
        }
    }

    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }


}
