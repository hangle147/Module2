package Arrays_and_Methods_in_Java;

import java.util.Scanner;

public class SumMainDiagonal {
    public static int[][] enterArray(int[][] matrix, int size) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        return matrix;
    }

    public static void displayArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sumMainDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        System.out.print("Nhập kích thước của mảng vuông 2 chiều: ");
        size = sc.nextInt();

        int[][] matrix = new int[size][size];

        System.out.println("Nhập các phần tử của mảng: ");
        enterArray(matrix, size);
        System.out.println("Mảng đã nhập: ");
        displayArray(matrix);
        System.out.print("Tổng các phần tử trong đường chéo chính: " + sumMainDiagonal(matrix));
    }
}
