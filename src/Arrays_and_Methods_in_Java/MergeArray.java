package Arrays_and_Methods_in_Java;

import java.util.Scanner;

public class MergeArray {

    public static int[] enterArray(int[] array, int size) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int[] mergeArray(int[] array1, int[] array2, int size1, int size2) {
        int[] array3 = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }
        for (int j = 0; j < size2; j++) {
            array3[size1 + j] = array2[j];
        }
        return array3;
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int size1, size2;

        System.out.print("Nhập số lượng phần tử có trong mảng 1 (nhỏ hơn 10): ");
        do {
            size1 = sc.nextInt();
        } while (size1 >= 10);
        System.out.println("Nhập các phần tử của mảng 1");
        enterArray(array1, size1);

        System.out.print("Nhập số lượng phần tử có trong mảng 2 (nhỏ hơn 10): ");
        do {
            size2 = sc.nextInt();
        } while (size2 >= 10);
        System.out.println("Nhập các phần tử của mảng 2");
        enterArray(array2, size2);

        displayArray(mergeArray(array1, array2, size1, size2));
    }
}
